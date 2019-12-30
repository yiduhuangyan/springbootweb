package com.cn.zjh.domain;

import java.io.Serializable;

public class ResponseMessage implements Serializable {

	private static final long serialVersionUID = 8291926470534637561L;

	private String code;

	private String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
