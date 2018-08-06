package com.springboot.config;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties
@PropertySource(value = "classpath:config.properties")
public class Config implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3967241437726417884L;

	private String baidu;
	
	private String google;

	public String getBaidu() {
		return baidu;
	}

	public void setBaidu(String baidu) {
		this.baidu = baidu;
	}

	public String getGoogle() {
		return google;
	}

	public void setGoogle(String google) {
		this.google = google;
	}
	
	
	
}
