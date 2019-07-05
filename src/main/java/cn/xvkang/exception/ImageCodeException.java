package cn.xvkang.exception;

import org.springframework.security.core.AuthenticationException;

public class ImageCodeException extends AuthenticationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6171031227410622142L;

	public ImageCodeException(String message) {
		super(message);
	}

}
