package com.spring.jpa.practice.dboperation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.spring.jpa.practice.customer.CUSTOMERDETAILS;
import com.spring.jpa.practice.customer.Product;
import com.spring.jpa.practice.repository.CustomerRepository;

@Component
public class DbOperation {
	@Autowired
	CustomerRepository customerRepository;
//	
//public void addData() {
//	CUSTOMERDETAILS customerDetails=new CUSTOMERDETAILS();
//	customerDetails.setAddress("USA");
//	customerDetails.setAge(27);
//	customerDetails.setId(300);
//	customerDetails.setName("Robert");
//	customerRepository.save(customerDetails);
//}
//	
//public void addMultipleData() {
//	CUSTOMERDETAILS customerDetails1=new CUSTOMERDETAILS();
//	
//	CUSTOMERDETAILS customerDetails2=new CUSTOMERDETAILS();
//	CUSTOMERDETAILS customerDetails3=new CUSTOMERDETAILS();
//	customerDetails1.setAge(25);
//	customerDetails1.setAddress("India");
//	customerDetails1.setName("Nilu");
//	customerRepository.save(customerDetails1);
	
//	customerDetails2.setAge(26);
//	customerDetails2.setAddress("USA");
//	customerDetails2.setName("Mack");
//	customerDetails3.setAddress("Nepal");
//	customerDetails3.setAge(28);
//	customerDetails3.setName("Hari");
//List<CUSTOMERDETAILS>	li1  = List.of(customerDetails2, customerDetails3);
//	customerRepository.saveAll(li1);
//	
//	
//}
//	public Optional<CUSTOMERDETAILS> getDetails() {
//		return customerRepository.findById(100);
//	}
//	public void deleteDetails(int id) {
//		customerRepository.deleteById(id);
//		System.out.println("Data Deleted successfully");
//	}
//	public List<CUSTOMERDETAILS> getDetailsByName(String name){
//		return customerRepository.findByName(name);
//		
//	}
	
	
	//Native Query 
//	public List<CUSTOMERDETAILS>getAllUserDetails(){
//		return customerRepository.getAllUserDetails();
//		
//	}
	
	    
	
	
	
	  //Native Query by index parametor
	
//	public List<CUSTOMERDETAILS>getDetailsByCity(String city){
//		return customerRepository.getDetailsByCity(city);
//		
//	}
	
//	 public List<CUSTOMERDETAILS>getByAge(int age){
//		return customerRepository.getByAge(age);
//		
//	}
	
//	public void addDetails(int id,int age) {
//		customerRepository.addDetails(id, age);
//		
//	}
	
//	public void getAllDetailsBySort() {
//	List<CUSTOMERDETAILS> li=	customerRepository.findAll(Sort.by(org.springframework.data.domain.Sort.Direction.DESC, "Age"));
//	System.out.println(li);
//	}
//	
//	public Page<CUSTOMERDETAILS> findByPage(){
//		return customerRepository.findAll(Pageable.ofSize(2));
//		
//	}
	
//	public void add() {
//		Product product=new Product();
//		product.setId(10);
//		product.setName("Bat");
//		CUSTOMERDETAILS customerdetails=new CUSTOMERDETAILS();
//		customerdetails.setAddress("India");
//		customerdetails.setAge(25);
//		customerdetails.setId(1000);
//		customerdetails.setName("Aruna");
//		customerdetails.setProduct(product);
//		customerRepository.save(customerdetails);
//	}
//	
	
}
