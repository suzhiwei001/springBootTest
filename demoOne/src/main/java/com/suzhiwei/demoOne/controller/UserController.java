package com.suzhiwei.demoOne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.suzhiwei.demoOne.Bean.User;
import com.suzhiwei.demoOne.Service.UserService;
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	/**
	 * 展示全部人员
	 * @return 
	 */
	@RequestMapping("/showAllUser")
	@ResponseBody
	public ModelAndView showAllUser() {
		ModelAndView modelAndView = new ModelAndView();
		List<User> userList = userService.showAllUser();
		modelAndView.addObject("userList",userList);//参数
		modelAndView.setViewName("userList");//页面
		return modelAndView;
	}
	/**
	 * 根据姓名查询人员
	 * @param name
	 * @return
	 */
	@RequestMapping("/userName")
	@ResponseBody
	public ModelAndView  findUserByName(String name) {
		ModelAndView modelAndView = new ModelAndView();
		User user = userService.findUserByName(name);
		modelAndView.addObject("user",user);//参数
		modelAndView.setViewName("user");//页面
		return modelAndView;
	}
	
	/**
	 * 新增人员
	 */
	@RequestMapping("/insertUser")
	public void insertUser(User user) {
		userService.insertUser(user);
	}
}
