package com.scottmarden.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {
	
	@RequestMapping("/")
	public String index(HttpSession session){
		if(session.getAttribute("visits") == null) {
			int visits = 0;
			session.setAttribute("visits", visits);
		}
		int visits = (int) session.getAttribute("visits");
		visits++;
		session.setAttribute("visits", visits);
		
		return "index.jsp";
	}
}
