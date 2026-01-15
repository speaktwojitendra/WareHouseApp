package com.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.entity.Teacher;

public interface NewInterface extends JpaRepository<Teacher, Integer>{

}
