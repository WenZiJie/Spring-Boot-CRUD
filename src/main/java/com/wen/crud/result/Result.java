package com.wen.crud.result;

import java.util.List;

public class Result {
	private int code = 1;
	private String msg = "访问人数过多！请稍后再来...";
	private int count = 0;
	private List data = null;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void Msg(String msg) {
		this.msg = msg;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List getData() {
		return data;
	}
	public void setData(List data) {
		this.data = data;
	}
	public Result() {}
	public Result(int code, String msg, int count, List data) {
		super();
		this.code = code;
		this.msg = msg;
		this.count = count;
		this.data = data;
	}
	
	
}
