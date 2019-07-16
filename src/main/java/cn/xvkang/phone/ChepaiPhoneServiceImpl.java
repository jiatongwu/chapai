package cn.xvkang.phone;

import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import cn.xvkang.phone.thrift.ChepaiPhoneService;
import cn.xvkang.phone.thrift.DataException;

@Component
public class ChepaiPhoneServiceImpl implements ChepaiPhoneService.Iface {
	private Logger logger = LoggerFactory.getLogger(ChepaiPhoneServiceImpl.class);

	@Override
	public String say(String msg) throws DataException, TException {
		logger.debug("服务器say()收到消息：" + msg);
		return "helloworld";
	}

}
