package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.entity.Projects;

public interface projectRepository extends JpaRepository<Projects, Long> {

}
