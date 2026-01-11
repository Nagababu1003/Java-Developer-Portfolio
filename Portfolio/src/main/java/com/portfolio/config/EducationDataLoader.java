package com.portfolio.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.portfolio.entity.Education;
import com.portfolio.service.EducationService;

@Configuration
public class EducationDataLoader {
 
	@Bean
	CommandLineRunner loadEducationData(EducationService educationService) {
		return args->{
			if(educationService.count()==0) {
				
				educationService.save(new Education("10th Class (Secondary School Certificate)",
						"Sree Ramavat Model High School",
						"2018","9.3/10","/images/education/ssc.png",
						"/images/certificates/ssc_cert.jpg"));
				
				educationService.save(new Education("Diploma in Computer Engineering",
						"Tegala Ram Reddy College of Technology",
						"2018-2021","8.98/10","/images/education/diploma.jpeg",
						"/images/certificates/diploma_cert.jpg"));
				
				educationService.save(new Education("B.Tech in Computer Science and Engineering",
						"Hyderabad Institute of Technology and Management","2021-2024",
						"6.88/10","/images/education/btech.jpg","/images/certificates/btech_cert.jpg"));
				
			}
		};
	}
}
