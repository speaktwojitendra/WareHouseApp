package com.spring.rest_practice.controller;


import java.net.http.HttpHeaders;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest_practice.ServiceInterface;
import com.spring.rest_practice.entity.UserEntity;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController

public class User_Controller {
	@Autowired
	ServiceInterface serviceInterface;
	
	@PostMapping("/register")
public  String getUser(@RequestBody @Valid UserDetails userdetails,HttpServletResponse response) {

	UserEntity u=serviceInterface.findByNameAndId(userdetails.getId(),userdetails.getName());
	if(u==null) {
		serviceInterface.addDetails(userdetails);

		System.out.println(userdetails.getAge()+userdetails.getName());
		response.setStatus(201);
	return "Registration Successful";
	}
	
	else {
		return "Already data exist in the table body";
	}
	
}
	@GetMapping("/password/{password}")
	public List<UserDetails> getUserDataByPassword(@PathVariable String password){
		
		List<UserDetails>al=new ArrayList<UserDetails>();
	List<UserEntity>li=	serviceInterface.getDetailsBypassword(password);
	for(int i=0;i<li.size();i++) {
		UserEntity user=li.get(i);
		UserDetails userDetails=new UserDetails();
		userDetails.setAge(user.getAge());
		userDetails.setId(user.getId());
		userDetails.setName(user.getName());
		userDetails.setPassword(user.getPassword());
		al.add(userDetails);
	}
	return al;
	}
	@DeleteMapping("/delete")
	public String deleteData(@RequestParam (required = false)Integer id) {
		 return serviceInterface.deletedata(id);
		
		
	}
	
	@GetMapping("/demo1")
	public String getDemo() {
		System.out.println(10/0);
		return "Success";
	}
	
	@PostMapping("/data")
	public String herderDemo( @RequestHeader(name = "user_name",required = false,defaultValue = "flipkart") String username){
		return "connected user is:"+username;
		
	}
	
	@PostMapping("/data1")
	public ResponseEntity<String> herderDemo( ){
		org.springframework.http.HttpHeaders header=new org.springframework.http.HttpHeaders();
		header.add("Content_Type", "application/json");
		header.set("token", "hjhjjjgjghjhjhj");
		return new ResponseEntity<String>("hello",header, HttpStatus.OK);
	}
	
}
