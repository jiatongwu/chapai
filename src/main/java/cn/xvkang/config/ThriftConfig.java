package cn.xvkang.config;

import javax.servlet.Servlet;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServlet;

import cn.xvkang.phone.ChepaiPhoneServiceImpl;
import cn.xvkang.phone.thrift.ChepaiPhoneService;

//@Configuration
public class ThriftConfig {

	// @Bean
	public TProtocolFactory tProtocolFactory() {
		// We will use binary protocol, but it's possible to use JSON and few others as
		// well
		return new TBinaryProtocol.Factory();
	}

	// @Bean
	public Servlet chepaiphone(TProtocolFactory protocolFactory, ChepaiPhoneServiceImpl chepaiPhoneServiceImpl) {
		return new TServlet(new ChepaiPhoneService.Processor<ChepaiPhoneServiceImpl>(chepaiPhoneServiceImpl),
				protocolFactory);
	}
}
