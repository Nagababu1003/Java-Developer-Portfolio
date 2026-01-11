package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.entity.Education;

public interface EducationRepository extends JpaRepository<Education, Long> {

}
