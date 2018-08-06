package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.model.User;

@Controller
@RequestMapping(value = "/thymeleaf")
public class UserController {
	@RequestMapping(value = "/index")
	public String index(){
		return "index";
	}
	@RequestMapping(value= "/postUser")
	public String postUser(User user){
		ModelMap map = new ModelMap();
		map.addAttribute("user", user);
		System.out.println("userName:" + user.getUserName() + "password:" + user.getPassword());
		return "thymeleaf/userInfo";
	}
}
