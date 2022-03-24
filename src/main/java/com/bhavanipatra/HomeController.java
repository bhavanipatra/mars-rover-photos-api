package com.bhavanipatra;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String getHomeView(ModelMap model) {
		model.put("name", "Bhavani Shankar Patra");
		model.put("email", "bhavanipatra@gmail.com");
		return "index";
	}
}
