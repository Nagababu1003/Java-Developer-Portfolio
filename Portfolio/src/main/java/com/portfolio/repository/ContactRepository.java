package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
