package com.spring.warehouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.warehouse.exception.DataNotFoundException;
import com.spring.warehouse.model.WhUserType;
import com.spring.warehouse.repository.UserRepo;
@Service
public class UserServiceImpl implements UserServiceInter {
	@Autowired
UserRepo repo;
	@Override
	public WhUserType saveUser(WhUserType user) {
		// TODO Auto-generated method stub
	return	repo.save(user);
		
	}

	@Override
	public List<WhUserType> getAllUserData() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public WhUserType getOneUserData(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(()->new DataNotFoundException("Data not found"));
	}

	@Override
	public void DeleteUserData(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(getOneUserData(id).getId());
	}

}
