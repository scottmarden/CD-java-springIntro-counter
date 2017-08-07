package com.scottmarden.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterCtrl {
	
	@RequestMapping("/count")
	public String counter(HttpSession session){
		return "counter.jsp";
	}
}
