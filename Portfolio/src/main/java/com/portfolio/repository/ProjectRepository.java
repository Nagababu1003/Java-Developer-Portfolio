package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
