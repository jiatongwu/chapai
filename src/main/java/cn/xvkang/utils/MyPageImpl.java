package cn.xvkang.utils;

import java.util.List;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class MyPageImpl<T> extends PageImpl<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5758089360755361909L;
	@SuppressWarnings("unused")
	private final long code = 0;

	public MyPageImpl(List<T> content) {
		super(content);

	}

	public MyPageImpl(List<T> content, Pageable pageable, long total) {
		super(content, pageable, total);
	}

	public long getCode() {
		return code;
	}

}
