package cn.xvkang.phone;

import javax.annotation.PreDestroy;

import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TTransportFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import cn.xvkang.phone.thrift.ChepaiPhoneService;

@Component
public class ThriftServer {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@PreDestroy
	public void destory() {
		if (tServer != null) {
			try {
				tServer.stop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			logger.debug("thrift停止 ");
		}
	}

	private TServer tServer;
	@Value("${thrift.port}")
	private int port;
	@Value("${thrift.minWorkerThreads}")
	private int minThreads;
	@Value("${thrift.maxWorkerThreads}")
	private int maxThreads;

	private TCompactProtocol.Factory protocolFactory;
	private TTransportFactory transportFactory;

	@Autowired
	private ChepaiPhoneServiceImpl chepaiPhoneServiceImpl;

	public void init() {
		protocolFactory = new TCompactProtocol.Factory();// new TBinaryProtocol.Factory();
		transportFactory = new TFramedTransport.Factory();// new TTransportFactory();
	}

	@SuppressWarnings("rawtypes")
	public void start() {
		// TMultiplexedProcessor processor = new TMultiplexedProcessor();
		// processor.registerProcessor(JazzService.class.getSimpleName(), new
		// JazzService.Processor<JazzService.Iface>(hadoopService));
		ChepaiPhoneService.Processor processor = new ChepaiPhoneService.Processor<ChepaiPhoneService.Iface>(
				chepaiPhoneServiceImpl);
		init();
		try {
			TNonblockingServerSocket tNonblockingServerSocket = new TNonblockingServerSocket(port);
			THsHaServer.Args args1 = new THsHaServer.Args(tNonblockingServerSocket).minWorkerThreads(minThreads)
					.maxWorkerThreads(maxThreads);
			args1.protocolFactory(protocolFactory);
			args1.transportFactory(transportFactory);
			args1.processorFactory(new TProcessorFactory(processor));
			// TServer server = new TThreadPoolServer(tArgs);
			// TServer server = new TSimpleServer(tArgs);
			logger.info("thrift服务启动成功, 端口={}", port);
			// server.serve();
			tServer = new THsHaServer(args1);
			tServer.serve();

		} catch (Exception e) {
			logger.error("thrift服务启动失败", e);
		}

	}
}