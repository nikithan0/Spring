package com.xworkz.mvcintro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String fistMethod() {
		System.out.println("Controller method executed");
		return "Welcome";
		
	}

}
