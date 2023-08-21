package com.malek.show.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.malek.show.models.Show;
import com.malek.show.models.User;
import com.malek.show.services.ShowService;
import com.malek.show.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ShowController {
	@Autowired
	private ShowService showServ;
	@Autowired
	private UserService userServ;
	
	// DISPLAY ROUTE - READ ALL
	@GetMapping("/shows")
	public String home(Model m , HttpSession s) {
		Long UserId= (Long) s.getAttribute("user_id");
		  // Route Guard
		if (UserId==null) {
			return"redirect:/login";
		}else {
		
		List<Show> allTheShows = showServ.allShows();
		m.addAttribute("showsList", allTheShows);
		return "home.jsp";
	}
	}
	
	// DISPLAY ROUTE - FORM
	@GetMapping("/shows/new")
	public String create(@ModelAttribute("show") Show show,
						Model m) {
		List<Show> allTheShows = showServ.allShows();
		m.addAttribute("showsList", allTheShows);
		return "create.jsp";
	}
	
	// ACTION ROUTE - Process Form
	@PostMapping("/shows/new")
	public String createShow(@Valid @ModelAttribute("show") Show show, BindingResult result,
							Model m,HttpSession s) {
		
		if (result.hasErrors()) {
			List<Show> allTheShows = showServ.allShows();
			m.addAttribute("showsList", allTheShows);
			return "create.jsp";
		} else {
//			// Grub the cuurrent loggedin User
						Long UserId= (Long) s.getAttribute("user_id");
						User loggedInUser = userServ.findOne(UserId);
						// set the watcher as loggedin user
						show.setWatcher(loggedInUser);
			// save the book
		Show newShow = showServ.createShow(show);

		return "redirect:/shows";
		}
		
	}
	// Display Route - Edit form
	
		@GetMapping("shows/{id}/edit")
		public String editPage( @ModelAttribute("show") Show show ,@PathVariable("id") Long id, Model model) {
			
			// find that show with provided id
			Show thisShow = showServ.findShow(id);
			
			// pass thisshow to the jsp page 
			model.addAttribute("show",thisShow);
			
			return "edit.jsp";
		}
	//	
		@PutMapping("/shows/{id}/edit")
		public String updateShow(@Valid @ModelAttribute("show") Show show, BindingResult result,
				@PathVariable("id") Long id) {
			if (result.hasErrors()) {
				return "edit.jsp";
			} else {
////				// Grub the  old watcher
				Show oldShow	= showServ.findShow(id);
//				// set the watcher as loggedin user
					show.setWatcher(oldShow.getWatcher());
//						
				// if there are no errors update car
				showServ.updateShow(show);
				return "redirect:/shows";
			}
		}
	//	
	// DELETE
	
		@DeleteMapping("/shows/{id}")
		public String delete(@PathVariable("id") Long id) {
			showServ.deleteShow(id);
			return "redirect:/shows";
		}
		// Show Ones
		
		
			@GetMapping("/shows/{id}")
			public String showOne (@PathVariable("id") Long id , Model model) {
			Show thisShow = showServ.findShow(id);
			model.addAttribute("thisshow",thisShow);
			return "one.jsp";
		
		
	}

	}


