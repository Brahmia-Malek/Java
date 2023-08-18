package com.nour.Lookify.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nour.Lookify.Model.LoginUser;
import com.nour.Lookify.Model.User;
import com.nour.Lookify.Services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller

public class UserController {
@Autowired
private UserService userServ;

@GetMapping("/user")
public String index(Model model) {

    model.addAttribute("newUser", new User());
    model.addAttribute("newLogin", new LoginUser());
    return "login.jsp";
}
@PostMapping("/register")
public String register(@Valid @ModelAttribute("newUser") User newUser, 
        BindingResult result, Model model, HttpSession session) {
    
    userServ.register(newUser, result);
    
    if(result.hasErrors()) {
        // Be sure to send in the empty LoginUser before 
        // re-rendering the page.
        model.addAttribute("newLogin", new LoginUser());
        return "login.jsp";
    }
    
    session.setAttribute("userId", newUser.getId());

    return "redirect:/";
}
@PostMapping("/login")
public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
        BindingResult result, Model model, HttpSession session) {
    
    // Add once service is implemented:
    User user = userServ.login(newLogin, result);

    if(result.hasErrors()) {
        model.addAttribute("newUser", new User());
        return "login.jsp";
    }

    session.setAttribute("userId", user.getId());

    return "redirect:/";
}
}
