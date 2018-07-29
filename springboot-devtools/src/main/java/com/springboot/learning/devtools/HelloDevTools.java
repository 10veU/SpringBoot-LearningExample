package com.springboot.learning.devtools;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDevTools {
	@RequestMapping(value="/hello")
	public String DevTools(){
		return "Hello World";
	}
}
