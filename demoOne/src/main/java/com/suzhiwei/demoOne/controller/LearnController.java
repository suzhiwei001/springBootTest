package com.suzhiwei.demoOne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/learn")
public class LearnController {
	@RequestMapping("/index")
	public String learn() {
		return "index";
	}
}
