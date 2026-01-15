package com.spring.rest_practice;

import java.util.List;
import java.util.Optional;

import com.spring.rest_practice.controller.UserDetails;
import com.spring.rest_practice.entity.UserEntity;

public interface ServiceInterface {
void addDetails(UserDetails userdetails);



List<UserEntity> getDetailsBypassword(String password);



String deletedata(Integer id);


UserEntity findByNameAndId(int id, String name);
}
