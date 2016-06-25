package com.ailk.sets.common;

import java.io.Serializable;

/**
 * 基本的响应对象
 * 
 * @author 毕希研
 * 
 */
public class APResponse<T> implements Serializable {
	private static final long serialVersionUID = 707889549300240834L;

	private String code;//SysBaseResponse中定义的参数
	private String message;//消息

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

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
