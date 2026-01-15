package com.spring.jpa.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.*;
import com.spring.jpa.practice.customer.CUSTOMERDETAILS;

import jakarta.transaction.Transactional;
@Transactional

public interface CustomerRepository extends JpaRepository<CUSTOMERDETAILS,Long>{

	
	public List<CUSTOMERDETAILS> findByName(String name); 
	@Query(value = "select * from CUSTOMERDETAILS",nativeQuery = true)
	public List<CUSTOMERDETAILS>getAllUserDetails();
	
	@Query(value="select * from customerdetails where address=?1",nativeQuery = true)
	List<CUSTOMERDETAILS>getDetailsByCity(String city);
	
	@Query(value="select * from customerdetails where age=:cage" ,nativeQuery = true)
	List<CUSTOMERDETAILS>getByAge(@Param("cage")int age);
	@Modifying
	@Query(value="insert into customerdetails(id,age) values(?1,?2)",nativeQuery = true)
	 void addDetails(int id,int age);
}
