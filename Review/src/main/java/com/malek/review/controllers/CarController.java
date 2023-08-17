package com.malek.review.controllers;

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

import com.malek.review.models.Car;
import com.malek.review.models.User;
import com.malek.review.services.CarService;
import com.malek.review.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class CarController {
	@Autowired
	private CarService carServ;
	@Autowired
	private UserService userServ;
	// DISPLAY ROUTE - READ ALL
	@GetMapping("/home")
	public String home(Model m , @ModelAttribute("car") Car car ,HttpSession s) {
		Long UserId= (Long) s.getAttribute("user_id");
		  // Route Guard
		if (UserId==null) {
			return"redirect:/login";
		}else {
		
			
		List<Car> allTheCars = carServ.allCars();
		m.addAttribute("carsList", allTheCars);
		return "home.jsp";
	}
	}
	
	

//	
	// ACTION ROUTE - Process Form
	@PostMapping("/cars")
	public String createCar(@Valid @ModelAttribute("car") Car car, BindingResult result,
							Model m,HttpSession s) {
		
		if (result.hasErrors()) {
			List<Car> allTheCars = carServ.allCars();
			m.addAttribute("carsList", allTheCars);
			return "home.jsp";
		
		} else {
			// Grub the cuurrent loggedin User
			Long UserId= (Long) s.getAttribute("user_id");
			User loggedInUser = userServ.findOne(UserId);
			// set the driver as loggedin user
			car.setDriver(loggedInUser);
		
			// save the book
		Car newCar = carServ.createCar(car);

		return "redirect:/home";
		}
		
	}
//	
	// Display Route - Edit form
	
	@GetMapping("cars/{id}/edit")
	public String editPage( @ModelAttribute("car") Car car ,@PathVariable("id") Long id, Model model) {
		
		// find that car with provided id
		Car thisCar = carServ.findCar(id);
		
		// pass thiscar to the jsp page 
		model.addAttribute("car",thisCar);
		
		return "edit.jsp";
	}
//	
	@PutMapping("/cars/{id}/edit")
	public String updateCar(@Valid @ModelAttribute("car") Car car, BindingResult result,
			@PathVariable("id") Long id) {
		if (result.hasErrors()) {
			return "home.jsp";
		} else {
			// Grub the  old driver
			Car oldCar	= carServ.findCar(id);
			// set the driver as loggedin user
				car.setDriver(oldCar.getDriver());
					
			// if there are no errors update car
			carServ.updateCar(car);
			return "redirect:/home";
		}
	}
//	
	// DELETE
	
	@DeleteMapping("/cars/{id}")
	public String delete(@PathVariable("id") Long id) {
		carServ.deleteCar(id);
		return "redirect:/home";
	}
	// Show Ones
	
	
		@GetMapping("/cars/{id}")
		public String showOne (@PathVariable("id") Long id , Model model) {
		Car thisCar = carServ.findCar(id);
		model.addAttribute("thiscar",thisCar);
		return "one.jsp";
	
	
}
}
