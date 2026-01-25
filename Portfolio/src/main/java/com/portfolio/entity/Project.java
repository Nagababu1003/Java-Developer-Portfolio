package com.portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private String description;
	private String techStack;
	private String githubLink;
	private String imageUrl;
	private String visitLink;
	
	public Project() {
		
	}


	public Project(String name, String description, String techStack, String githubLink, String imageUrl,String visitLink) {
		super();
		this.name = name;
		this.description = description;
		this.techStack = techStack;
		this.githubLink = githubLink;
		this.imageUrl = imageUrl;
		this.visitLink = visitLink;
	}
	
	
}
