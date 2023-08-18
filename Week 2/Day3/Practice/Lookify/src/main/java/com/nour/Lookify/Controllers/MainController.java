package com.nour.Lookify.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nour.Lookify.Model.Artist;
import com.nour.Lookify.Model.Lookify;
import com.nour.Lookify.Model.User;
import com.nour.Lookify.Services.ArtistServices;
import com.nour.Lookify.Services.LookifyService;
import com.nour.Lookify.Services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	private LookifyService LookifyService;
	@Autowired
	private ArtistServices ArtistService;
	@Autowired
	private UserService userServ;

	@GetMapping("/")
	public String index(@ModelAttribute("artist") Artist name_artist,HttpSession session,Model model) {
		Long userId=(long)session.getAttribute("userId");
		if (userId==null)
		{
			return "redirect:/login";
		}
		User user=userServ.findById(userId);
		model.addAttribute("user",user);
		
		return "index.jsp";
	}
	@PostMapping("/create/artist")
	public String createArtist(@Valid @ModelAttribute("artist") Artist artist, BindingResult result) 
	{
		if(result.hasErrors()) {
			return "index.jsp";
		}
		ArtistService.create(artist);
		return "redirect:/dashboard";
	}
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Lookify> lookList =  LookifyService.allLookifys();
		model.addAttribute("Lookifys",lookList);
		return "dashboard.jsp";
	}
	
	@PostMapping("/dashboard")
	public String dashboard(@RequestParam("artist") String artist, Model model) {
		model.addAttribute("artist", artist);
		return "redirect:/search/"+artist;
	}
	
	@GetMapping("/search/{artist}")
	public String searchResult(@PathVariable("artist") String artist, Model model) {
		model.addAttribute("Lookifys", LookifyService.findByArtist(artist));
		model.addAttribute("searchTerm", artist);
		return "searchResults.jsp";
	}
	
	@GetMapping("/Lookifys/new")
	public String newLookify(@ModelAttribute("Lookify") Lookify Lookify,Model model) {
		model.addAttribute("artist",ArtistService.allArt());
		return "newLookify.jsp";
	}
	
	@PostMapping("/Lookifys/new")
	public String newLookify(@Valid @ModelAttribute("Lookify") Lookify Lookify, BindingResult result) {
		if(result.hasErrors()) {
			return "newLookify.jsp";
		}
		LookifyService.addLookify(Lookify);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/Lookifys/{id}")
	public String viewLookify(@PathVariable("id") Long id, Model model) {
		model.addAttribute("Lookify", LookifyService.LookifyById(id));
		return "LookifyDetails.jsp";
	}
	
	@GetMapping("/Lookifys/delete/{id}")
	public String deleteLookify(@PathVariable("id") Long id) {
		LookifyService.deleteLookify(LookifyService.LookifyById(id));
		return "redirect:/dashboard";
	}
	//Top  Songs
	@GetMapping("/topten")
	public String topTenLookify(Model model)
	{
		List <Lookify> topten= LookifyService.topTen();
		model.addAttribute("topten",topten);
		return "topten.jsp";
	}
}
