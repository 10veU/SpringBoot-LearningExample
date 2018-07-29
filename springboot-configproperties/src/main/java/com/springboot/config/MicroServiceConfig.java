package com.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "micro.service")
@PropertySource(value = "classpath:resources.properties")
public class MicroServiceConfig {
	/** 微服务接口地址1 */
	private String url1;
	/** 微服务接口地址2 */
	private String url2;
	/** 微服务接口地址3 */
	private String url3;
	public String getUrl1() {
		return url1;
	}
	public void setUrl1(String url1) {
		this.url1 = url1;
	}
	public String getUrl2() {
		return url2;
	}
	public void setUrl2(String url2) {
		this.url2 = url2;
	}
	public String getUrl3() {
		return url3;
	}
	public void setUrl3(String url3) {
		this.url3 = url3;
	}
	@Override
	public String toString() {
		return "MicroServiceConfig [url1=" + url1 + ", url2=" + url2
				+ ", url3=" + url3 + "]";
	}

	
	
}
