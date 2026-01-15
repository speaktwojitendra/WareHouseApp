package com.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
