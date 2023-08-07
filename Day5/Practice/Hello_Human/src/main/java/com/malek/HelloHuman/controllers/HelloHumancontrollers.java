package com.malek.HelloHuman.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloHumancontrollers {
	@RequestMapping()
	public String helloHuman() {
		
		return "Hello Human";
	}
	@RequestMapping("/{name}")
	public String sayHello(@PathVariable("name") String username) {
		
		return "Hello " + username ;
	}
}

