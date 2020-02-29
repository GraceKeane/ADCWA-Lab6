package com.web2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThirdController {

  @RequestMapping(value = "/hello")
  public String helloWorld(Model model) {

    model.addAttribute("greeting", "Hello from php");
    return "helloWorld";
  }
}
