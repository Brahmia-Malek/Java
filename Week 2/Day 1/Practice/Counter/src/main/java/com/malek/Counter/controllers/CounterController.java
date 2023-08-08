package com.malek.Counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String Welcome(HttpSession session) {
		Integer count=0;
		if(session.getAttribute("count")==null){
			session.setAttribute("count", 0); 
		}else {
			count= (Integer) session.getAttribute("count");
					count++;
			session.setAttribute("count", count);
		}
//		session.setAttribute("count",3);
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String Counter() {
		return "Counter.jsp";
	}

}
