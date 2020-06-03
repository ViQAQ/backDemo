package com.wj.common.domain;

import com.wj.constant.ResponseCode;

public class Response<T>{

	private int status;
	
	private String msg;
	
	private T data;

	private Response(int status) {
		this.status = status;
	}

	private Response(int status, T data) {
		this.status = status;
		this.data = data;
	}

	private Response(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	private Response(int status, String msg, T data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public boolean isSuccess() {
		return this.status == ResponseCode.SUCCESS.getCode();
	}

	public int getStatus() {
		return status;
	}

	public T getData() {
		return data;
	}

	public String getMsg() {
		return msg;
	}

	public static <T> Response<T> createBySuccess() {
		return new Response<>(ResponseCode.SUCCESS.getCode());
	}

	public static <T> Response<T> createBySuccess(T data) {
		return new Response<>(ResponseCode.SUCCESS.getCode(), data);
	}

	public static <T> Response<T> createBySuccessMessage(String msg) {
		return new Response<>(ResponseCode.SUCCESS.getCode(), msg);
	}

	public static <T> Response<T> createBySuccessCodeMessage(String msg, T data) {
		return new Response<>(ResponseCode.SUCCESS.getCode(), msg, data);
	}

	public static <T> Response<T> createByError() {
		return new Response<>(ResponseCode.ERROR.getCode());
	}

	public static <T> Response<T> createByErrorMessage(String errorMessage) {
		return new Response<>(ResponseCode.ERROR.getCode(), errorMessage);
	}

	public static <T> Response<T> createByErrorCodeMessage(int erroCode, String errorMessage) {
		return new Response<>(erroCode, errorMessage);
	}
}
