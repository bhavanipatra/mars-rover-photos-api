package com.bhavanipatra.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.bhavanipatra.response.MarsRoverApiResponse;
import com.bhavanipatra.service.MarsRoverApiService;

@Controller
public class HomeController {
	@Autowired
	MarsRoverApiService roverService;
	
	@GetMapping("/")
	public String getHomeView(ModelMap model) {
		MarsRoverApiResponse roverData = roverService.getRoverData();
		model.put("roverData", roverData);
		return "index";
	}
}
