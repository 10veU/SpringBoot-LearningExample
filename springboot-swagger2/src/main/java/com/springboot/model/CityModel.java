package com.springboot.model;

import java.io.Serializable;

public class CityModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** �������� */
	private String postCode;
	/** �������� */
	private String cityName;
	/** ���м���   �����߳��У� */
	private String cityLevel;
	/** ������� */
	private String cityArea;
	
	/**
	 * ��ȡ��������
	 * @return
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * ������������
	 * @param postCode
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	/**
	 * ��ȡ��������
	 * @return
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * ���ó�������
	 * @param cityName
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * ��ȡ���м���
	 * @return
	 */
	public String getCityLevel() {
		return cityLevel;
	}
	/**
	 * ���ó��м���
	 * @param cityLevel
	 */
	public void setCityLevel(String cityLevel) {
		this.cityLevel = cityLevel;
	}
	/**
	 * ��ȡ�������
	 * @return
	 */
	public String getCityArea() {
		return cityArea;
	}
	/**
	 * ���ó������
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
