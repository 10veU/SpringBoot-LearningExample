package com.springboot.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1158308753180017451L;

	private String name;
	
	private String age;
	@JsonFormat(locale="yy-MM-dd hh:mm:ss",timezone = "GMT+8")
	private Date birthday;
	
	private String desc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
	
	
}
