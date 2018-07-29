package com.springboot.microservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.config.MicroServiceConfig;

@RestController
public class ServiceManageController {
	@Autowired
	private MicroServiceConfig microServiceConfig;
	
	@RequestMapping(value ="/propertiesMsg")
	public Map<String, Object>  getProperties(){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		MicroServiceConfig config = new MicroServiceConfig();
		config.setUrl1(microServiceConfig.getUrl1());
		config.setUrl2(microServiceConfig.getUrl2());
		config.setUrl3(microServiceConfig.getUrl3());
		System.out.println(config.toString());
		resultMap.put("Status", "SUCCESS");
		resultMap.put("Data", config);
		return resultMap;
	}
}
