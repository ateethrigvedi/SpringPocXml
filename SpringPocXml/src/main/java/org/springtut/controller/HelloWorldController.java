package org.springtut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value = "/hello" , method = RequestMethod.GET)
	public String Hello(ModelMap model){
		
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "welcome";
		
	}
}
