package com.fn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetController {
	@RequestMapping("/greet/{name}")
	public String greet(Model model, @PathVariable String name){
		model.addAttribute("name",name);
		return "greet";
	}
}
