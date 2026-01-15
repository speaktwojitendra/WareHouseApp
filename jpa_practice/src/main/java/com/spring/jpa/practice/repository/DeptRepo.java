package com.spring.jpa.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.practice.entity.Department;

public interface DeptRepo  extends JpaRepository<Department, Integer>{

}
