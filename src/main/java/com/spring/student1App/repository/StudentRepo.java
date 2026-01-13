package com.spring.student1App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.student1App.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
