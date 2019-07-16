package cn.xvkang.middle;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.xvkang.dto.MyUserDetails;
import cn.xvkang.primaryentity.Log;
import cn.xvkang.primarymapperdynamicsql.LogDynamicSqlMapper;

@Component
public class LogServiceMiddle {
	@Autowired
	private LogDynamicSqlMapper logDynamicSqlMapper;

	public void insertOperateLog(String operateName, String operateUsername, String operateUserPhone, String operateCph,
			Date validEnd) {
		RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
		HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();
		Log log = new Log();
		log.setClientIp(request.getRemoteAddr());
		log.setCreatetime(new Date());
		log.setOperateUsername(operateUsername);
		log.setOperateUserPhone(operateUserPhone);
		log.setOperateCph(operateCph);
		log.setOperateName(operateName);
		log.setValidend(validEnd);
		log.setUserAgent(request.getHeader("User-Agent"));
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		MyUserDetails myUserDetails = (MyUserDetails) authentication.getPrincipal();
		log.setUserId(myUserDetails.getMySystemUser().getId());
		logDynamicSqlMapper.insert(log);
	}

}
