package com.spring.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.warehouse.model.ShipmentType;

public interface ShpmentTypeRepo extends JpaRepository<ShipmentType, Integer> {

}
