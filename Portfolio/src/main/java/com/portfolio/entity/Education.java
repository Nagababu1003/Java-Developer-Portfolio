package com.portfolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="education")
public class Education {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; 
	
	
	private String degree;
	private String institution;
	
	@Column(name="acadamic_year")
	private String year;
	private String grade;
	
	private String imageUrl;
	
	private String certificateUrl;
	
	
	public Education() {
		
	}
	
	
	
	public Education(String degree, String institution, String year, String grade, String imageUrl,
			String certificateUrl) {
		super();
		this.degree = degree;
		this.institution = institution;
		this.year = year;
		this.grade = grade;
		this.imageUrl = imageUrl;
		this.certificateUrl = certificateUrl;
	}
	
	
}
