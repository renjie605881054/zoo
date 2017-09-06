package com.zoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("login")
@Controller
public class LoginController {

	@RequestMapping(value="login")
	public String login(){
		return "";
	}
}
