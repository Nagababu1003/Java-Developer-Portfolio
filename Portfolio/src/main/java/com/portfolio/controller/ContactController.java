package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.portfolio.entity.Contact;
import com.portfolio.service.ContactService;

import jakarta.validation.Valid;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService service;
	
	@GetMapping("/contact")
	public String form(Model model) {
		model.addAttribute("contact",new Contact());
		return "contact";
	}
	
	@PostMapping("/contact")
	public String submit(@Valid Contact contact, BindingResult result) {
		if(result.hasErrors())
			return "contact";
		service.save(contact);
		return "success";
	}
}
