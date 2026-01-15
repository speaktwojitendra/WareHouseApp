package com.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
