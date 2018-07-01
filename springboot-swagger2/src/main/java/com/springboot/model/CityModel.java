package com.springboot.model;

import java.io.Serializable;

public class CityModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** 邮政编码 */
	private String postCode;
	/** 城市名称 */
	private String cityName;
	/** 城市级别   （几线城市） */
	private String cityLevel;
	/** 城市面积 */
	private String cityArea;
	
	/**
	 * 获取邮政编码
	 * @return
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * 设置邮政编码
	 * @param postCode
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	/**
	 * 获取城市名称
	 * @return
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * 设置城市名称
	 * @param cityName
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * 获取城市级别
	 * @return
	 */
	public String getCityLevel() {
		return cityLevel;
	}
	/**
	 * 设置城市级别
	 * @param cityLevel
	 */
	public void setCityLevel(String cityLevel) {
		this.cityLevel = cityLevel;
	}
	/**
	 * 获取城市面积
	 * @return
	 */
	public String getCityArea() {
		return cityArea;
	}
	/**
	 * 设置城市面积
	 * @param cityArea
	 */
	public void setCityArea(String cityArea) {
		this.cityArea = cityArea;
	}
	public CityModel(){};
	public CityModel(String postCode, String cityName, String cityLevel,
			String cityArea) {
		super();
		this.postCode = postCode;
		this.cityName = cityName;
		this.cityLevel = cityLevel;
		this.cityArea = cityArea;
	}
	
}
