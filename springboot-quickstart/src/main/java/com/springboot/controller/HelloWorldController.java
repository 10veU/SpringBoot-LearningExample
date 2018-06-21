package com.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
	// @EnableAutoConfiguration表示springboot加载
	@EnableAutoConfiguration
	// @RestController表示该接口全部返回json格式,加这个注解，在每个接口上不需要加@ResponseBody注解
	@RestController
	public class HelloWorldController {
		@RequestMapping("/helloworld")
		public String  helloworld(){
			return "helloworld";
		}
	@RequestMapping("/getMap")
	public Map<String, Object> getMap(){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("statuCode", "200");
		resultMap.put("message", "success");
		return resultMap;
	}
	
	//springboot启动主函数
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldController.class, args);
	}
}
