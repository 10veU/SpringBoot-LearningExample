package com.springboot.learning.springbootbanner;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootBannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBannerApplication.class, args);
	}
	/**
	 * 通过启动类关闭图案的两种方式
	 */
	
	/*public static void main(String[] args) {
		new SpringApplicationBuilder(SpringbootBannerApplication.class).bannerMode(Banner.Mode.OFF).run(args);
	}*/
	/*public static void main(String[] args) {
	SpringApplication app =	new SpringApplication(SpringbootBannerApplication.class);
	app.setBannerMode(Banner.Mode.OFF);
	app.run(args);
	}*/
}
