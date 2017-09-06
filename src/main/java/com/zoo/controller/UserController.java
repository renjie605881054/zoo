package com.zoo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.istack.internal.logging.Logger;
import com.zoo.dao.UserDao;
import com.zoo.pojo.User;
import com.zoo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController{
	private Logger log = Logger.getLogger(UserController.class);
	
	@Resource
	private UserService userService;
	
	//@Resource
	//private UserDao userDao;
	
	@RequestMapping(value="/info", method=RequestMethod.POST)
	public String getUser(HttpServletRequest request){
		User user = userService.getUserById("1");
		//User user = userDao.getUserById(1);
		//System.out.println(user);
		return "user";
	}
}
