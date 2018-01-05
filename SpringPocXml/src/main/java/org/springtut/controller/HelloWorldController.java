package org.springtut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloWorldController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String Hello(ModelMap model) {
		// ModelAndView model = new ModelAndView("" );
		model.addAttribute("message", "Spring  MVC Hello World");
		return "welcome";

	}

	@RequestMapping(value = "/helloAgain", method = RequestMethod.POST)
	public String HelloAgain( ModelMap model) {
		model.addAttribute(
				"message",
				"Hello and welcome to  SpringMVC" );
		return "welcome";

	}
}
