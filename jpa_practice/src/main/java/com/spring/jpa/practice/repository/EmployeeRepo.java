package com.spring.jpa.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.practice.entity.Employe;

import jakarta.transaction.Transactional;
@Transactional
public interface EmployeeRepo extends JpaRepository<Employe, Integer> {

}
