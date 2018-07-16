package com.springboot.model;

import java.io.Serializable;
import java.util.Date;

public class UserModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 用户名 */
	private String userName;
	/** 用户密码 */
	private String password;
	/** 用户年龄 */
	private Integer age;
	/** 用户性别 */
	private String sex;
	/** 用户生日 */
	private Date brithday;
	/** 用户描述(description) */
	private String desc;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBrithday() {
		return brithday;
	}
	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserModel(String userName, String password, Integer age, String sex,
			Date brithday, String desc) {
		super();
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.sex = sex;
		this.brithday = brithday;
		this.desc = desc;
	}
	
	
	
	
}
