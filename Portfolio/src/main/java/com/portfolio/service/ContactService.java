package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.entity.Contact;
import com.portfolio.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository repo;
	
	public void save(Contact c) {
		repo.save(c);
	}
	
}
