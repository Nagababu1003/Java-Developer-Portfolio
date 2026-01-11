package com.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.portfolio.service.EducationService;

@Controller
public class EducationController {

	private final EducationService educationSerivce;

	
	public EducationController(EducationService educationSerivce) {
		super();
		this.educationSerivce = educationSerivce;
	}


	@GetMapping("/education")
	private String education(Model model) {
		model.addAttribute("educations",educationSerivce.getAll());
		return "education";
	}
	
	
}
