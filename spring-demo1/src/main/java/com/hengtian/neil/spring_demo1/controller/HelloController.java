package com.hengtian.neil.spring_demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(path = "someone", method = RequestMethod.POST)
	@ResponseBody
	public String someone(String name) {
		return "hello " + name;
	}

	@RequestMapping(path = "index", method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}

}
