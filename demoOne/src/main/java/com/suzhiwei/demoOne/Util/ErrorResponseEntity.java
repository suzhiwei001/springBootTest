package com.suzhiwei.demoOne.Util;
/**
 * @author 759201272
   *   异常信息模板
 */
public class ErrorResponseEntity {
    private int code;
    private String message;
	public ErrorResponseEntity(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
