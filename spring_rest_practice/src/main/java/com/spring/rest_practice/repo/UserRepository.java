package com.spring.rest_practice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest_practice.entity.UserEntity;

import jakarta.transaction.Transactional;
@Transactional
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	List<UserEntity> findByPassword(String password);

	UserEntity findByIdAndName(int id, String name);

}
