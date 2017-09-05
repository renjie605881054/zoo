package com.zoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BaseController {

	protected final String WebRoot = ""; 
	
	@RequestMapping(value="/")
	public String index(){
		return "index";
	}
}
