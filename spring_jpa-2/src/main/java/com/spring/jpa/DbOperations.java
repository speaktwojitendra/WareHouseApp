package com.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.jpa.entity.Address;
import com.spring.jpa.entity.Users;
import com.spring.jpa.repository.AddressRepository;
import com.spring.jpa.repository.UsersRepository;

@Component
public class DbOperations {
	@Autowired
UsersRepository usersRepository;
	@Autowired
	AddressRepository addressRepository;
//	
//	public void addUsersDetails() {
//	Address address=new Address();
//	address.setAid(100);
//	address.setAName("Gomundia");
//	
//	Users users=new Users();
//	users.setU_id(02);
//	users.setUname("Jitendra");
//	users.setAddress1(address);
//	usersRepository.save(users);
//	}
	
	//here when i call this method then it delete child table (Users ) and 
	//autometically delete the parent table data which mapped with child table row
	public void deleteFromUsers(Integer id) {
		usersRepository.deleteById(id);
	}
}
