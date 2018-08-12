package com.springboot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.model.User;

@Controller
public class UserController {
	
	@RequestMapping(value = "/getUserInfo")
	public String getUserInfo(ModelMap map){
		
		User user = new User();
		user.setName("大大蜡笔小小新");
		user.setAge("26");
		user.setBirthday(new Date());
		user.setDesc("<fonnt style = 'color:green'>Hello! SpringBoot...</font>");
		map.addAttribute("user", user);
		
		User user1 = new User();
		user1.setName("可乐");
		user1.setAge("18");
		user1.setBirthday(new Date());
		user1.setDesc("<fonnt style = 'color:green'>Hello! SpringBoot...</font>");
		
		
		User user2 = new User();
		user2.setName("健力宝");
		user2.setAge("10");
		user2.setBirthday(new Date());
		user2.setDesc("<fonnt style = 'color:green'>Hello! SpringBoot...</font>");
		
		List<User> userList = new ArrayList<User>();
		userList.add(user);
		userList.add(user1);
		userList.add(user2);
		map.put("userList",userList);
 		return "userInfo";
	}
	@PostMapping("/postUser")
	public String postUser(User user){
		System.out.println("用户姓名：" + user.getName() + " 用户年龄："+ user.getAge());
		return "redirect:getUserInfo";
	}
}
