package com.spring.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.warehouse.model.WhUserType;

public interface UserRepo extends JpaRepository<WhUserType, Integer>{

}
