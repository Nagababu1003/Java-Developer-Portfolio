package com.portfolio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.portfolio.entity.Education;
import com.portfolio.repository.EducationRepository;

@Service
public class EducationService {
	
	private final EducationRepository educationRepository;
	
	
	
	public EducationService(EducationRepository educationRepository) {
		super();
		this.educationRepository = educationRepository;
	}



	public List<Education> getAll(){
		return educationRepository.findAll();
	}
	
	public long count() {
		return educationRepository.count();
	}
	
	public void save(Education education) {
		educationRepository.save(education);
	}
}
