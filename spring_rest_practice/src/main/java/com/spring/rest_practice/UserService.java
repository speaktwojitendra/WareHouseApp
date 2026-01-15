package com.spring.rest_practice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring.rest_practice.controller.UserDetails;
import com.spring.rest_practice.entity.UserEntity;
import com.spring.rest_practice.repo.UserRepository;
@Component
@Service
public class UserService implements ServiceInterface{
@Autowired
UserRepository userRepository;
@Override
public void addDetails(UserDetails userDetails) {
	UserEntity userEntity=new UserEntity();
	userEntity.setId(userDetails.getId());
userEntity.setAge(userDetails.getAge());
userEntity.setName(userDetails.getName());
userEntity.setPassword(userDetails.getPassword());
	
	userRepository.save(userEntity);
	System.out.println("data saved successfully");
}
@Override
public List<UserEntity> getDetailsBypassword(String password) {
	// TODO Auto-generated method stub
	
return 	userRepository.findByPassword(password);
	
}
@Override
public String deletedata(Integer id) {
	// TODO Auto-generated method stub
	if(id==null) {
		return "Null id is not allowed";
	}
	else {
		userRepository.deleteById(id);
		return "Success";
	}
	
}
@Override
public UserEntity findByNameAndId(int id, String name) {
	return userRepository.findByIdAndName(id,name);

}



}
