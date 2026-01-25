package com.portfolio.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.portfolio.entity.Project;
import com.portfolio.repository.ProjectRepository;

@Configuration
public class ProjectDataLoader {

	@Bean
	CommandLineRunner loadProjectData(ProjectRepository repo) {
		return args->{
			if(repo.count()==0) {
				
				  repo.save(new Project("Personal Portfolio Website",
				  "A Responsive Personal Portfolio Website Using Java"
				  ,"Java,Spring Boot,H2 Database, HTML/CSS, JavaScript, BootStrap",
				  "https://github.com/Nagababu1003/Java-Developer-Portfolio","/images/Java Portfolio.png","https://java-developer-portfolio.onrender.com/"));

				  repo.save(new Project("AI Chatbot Using Spring AI",
					  "Developed a full-stack AI chatbot application.","Java 21, Spring Boot, Spring AI, OpenAI and React",
					  "https://github.com/Nagababu1003/AI-Chatbot","/images/chatbot.png","https://ai-chatbot-1-zoe0.onrender.com/"));
				  
				  repo.save(new Project("Personal Portfolio Website",
						"A Personal Portfolio Website using web development",
						"HTML5, CSS3, JavaScript, Vercel, GitHub, JSON",
						"https://github.com/Nagababu1003/personal-portfolio","/images/Portfolio.png","https://nagababu-portfolio.vercel.app/"));
				  
				  
				  repo.save(new Project("Simon Says Game Using JavaScript ",
				  "A Classic Electronic Memory Game helps to improve concentration","HTML, CSS, JavaScript",
				  "https://github.com/Nagababu1003/Simon-Says-Game","/images/simon.png","https://simon-says-game-puce-ten.vercel.app/"));
				 
				/*
				 * Project project1=new Project("Personal Portfolio Website",
				 * "A Responsive Personal Portfolio Website"
				 * ,"Java Spring Boot,H2 Database,BootStrap,Thymeleaf",
				 * "https://github.com/username/projectname","/images/portfolio.jpeg"); Project
				 * project2=new Project("Student Management System",
				 * "Curd Application to Manage students","Java Spring Boot,JPA, MySQL",
				 * "https://github.com/username/projectname","/images/student.jpeg"); Project
				 * project3=new Project("Hospital Management System",
				 * "Curd Application to Manage Hospitals","Java Spring Boot,JPA, MySQL",
				 * "https://github.com/username/projectname","/images/hospital.jpeg");
				 * 
				 * repo.save(project1); repo.save(project2); repo.save(project3);
				 */
				
			}
		};
	}
}
