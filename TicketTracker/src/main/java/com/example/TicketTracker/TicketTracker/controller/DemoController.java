package com.example.TicketTracker.TicketTracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@RequestMapping("/")
	  public String showHome() {
		  return "hello";
	  }

}
