package com.springboot.model;

/**
 * 返回的JSON结果对象类
 * @author lenovopc
 *
 */
public class JSONResult {
	
	/** 结果信息  (SUCCESS/FAIL)*/
	private String msg;
	/** 状态码 */
	private Integer status;
	/** 结果数据 */
	private Object data;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public JSONResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public JSONResult(String msg, Integer status, Object data) {
		super();
		this.msg = msg;
		this.status = status;
		this.data = data;
	}
	public JSONResult (Object data) {
		
		this.msg = "SUCCESS";
		this.status = 200;
		this.data = data;
	}
	
	public static JSONResult ok(Object data){
		return new JSONResult(data);
	}
	
	
	
}
