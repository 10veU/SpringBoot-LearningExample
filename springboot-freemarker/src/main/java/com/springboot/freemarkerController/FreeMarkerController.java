package com.springboot.freemarkerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.config.Config;



@Controller
@RequestMapping(value = "/freemarker")
public class FreeMarkerController {
	
	@Autowired
	private Config config;
	
	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap){
		modelMap.put("config", config);
		System.out.println(config.getBaidu());
		System.out.println(config.getGoogle());
		return "index";
	}
	
	@RequestMapping(value = "/center")
	public String center(){
		return "/freemarker/center";
	}
}	
