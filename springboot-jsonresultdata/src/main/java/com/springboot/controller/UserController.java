package com.springboot.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.JSONResult;
import com.springboot.model.UserModel;

//@Controller
@RestController
public class UserController {
	
	/**
	 * springMVC的方式
	 * @return
	 */
	// @RestController = @Controller + @ResponseBody 返回JSON格式的数据 
	/*@RequestMapping("/findUser")
	@ResponseBody
	public UserModel findUser(){
		UserModel userModel = new UserModel();
		userModel.setUserName("蜡笔小新");
		userModel.setPassword("123456");
		userModel.setAge(6);
		userModel.setBrithday(new Date());
		userModel.setSex("女");
		userModel.setDesc("蜡笔小新打酱油");
		return  userModel;
	}*/
	@RequestMapping("/getUser")
	public JSONResult getUser(){
		UserModel user = new UserModel("大大蜡笔小小新","666666",18,"男",new Date(),"大大蜡笔小小新");
		return JSONResult.ok(user);
	}
	
}