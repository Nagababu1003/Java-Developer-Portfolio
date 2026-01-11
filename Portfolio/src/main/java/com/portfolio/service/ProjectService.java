package com.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.entity.Project;
import com.portfolio.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository repo;
	
	public List<Project> getAll(){
		return repo.findAll();
	}
}
