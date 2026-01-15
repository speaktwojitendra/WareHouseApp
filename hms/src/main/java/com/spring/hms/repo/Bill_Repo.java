package com.spring.hms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.models.Bill;
@Repository
public interface Bill_Repo extends JpaRepository<Bill, Integer> {

}
