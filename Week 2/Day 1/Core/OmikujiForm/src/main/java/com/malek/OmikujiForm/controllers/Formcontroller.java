package com.malek.OmikujiForm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class Formcontroller {
	// Display Route
	
		@RequestMapping("/omikuji")
		public String form() {
			return "Form.jsp";
		}
		
		@RequestMapping(value="/processForm", method=RequestMethod.POST)
		public String process(@RequestParam("number") String number,
								@RequestParam("input1") String input1,
								@RequestParam("input2") String input2,
								@RequestParam("input3") String input3,
								@RequestParam("input4") String input4,
								@RequestParam("textinput") String textinput,
								HttpSession session,
								RedirectAttributes flash) {
			
			
			
//			System.out.println(number + " " + input1);
			session.setAttribute("number", number);
			session.setAttribute("input1", input1);
			session.setAttribute("input2", input2);
			session.setAttribute("input3", input3);
			session.setAttribute("input4", input4);
			session.setAttribute("textinput", textinput);
			
			
			return "redirect:/omikuji/show";
		}
		
		
		@RequestMapping("/omikuji/show")
		public String show() {
			return "show.jsp";
		}
		

}
