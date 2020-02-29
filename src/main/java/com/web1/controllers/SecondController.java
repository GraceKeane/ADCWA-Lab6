package com.web1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
	
	@RequestMapping(value = "/goodbye")
	  public String goodbyeWorld(Model model) {

	    model.addAttribute("greeting", "Goodbye to the World!");
	    return "goodbyeWorld";
	  }
	
	@RequestMapping(value = "/goodbye*")
	  public String goodbyeWorld1(Model model) {

	    model.addAttribute("greeting", "This is the default goodbye page");
	    return "goodbyeWorld";
	  }

}
