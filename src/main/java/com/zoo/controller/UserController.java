package com.zoo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zoo.pojo.User;
import com.zoo.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController{

	@Resource
	UserService userService;
	
	@RequestMapping(value="/info")
	public String getUser(HttpServletRequest request){
		User user = userService.getUserById(1);
		System.out.println(user);
		return "user";
	}
}
