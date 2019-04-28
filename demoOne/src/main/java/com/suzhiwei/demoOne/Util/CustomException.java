package com.suzhiwei.demoOne.Util;
/**
 * @author 759201272
   *   自定义异常类
 */
public class CustomException extends RuntimeException {

	private static final long serialVersionUID = -5703972639855234374L;

	private int code;

	public CustomException() {
		super();
	}

	public CustomException(int code,String message) {
		super(message);
		this.setCode(code);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
