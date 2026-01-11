package com.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.portfolio.service.ProjectService;

@Controller
public class ProjectController {
	
	private final ProjectService projectService;
	
	
	public ProjectController(ProjectService projectService) {
		
		this.projectService = projectService;
	}


	@GetMapping("/projects")
	public String projects(Model model) {
		model.addAttribute("projects", projectService.getAll());
		return "projects";
	}
}
