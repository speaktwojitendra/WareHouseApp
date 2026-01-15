package com.spring.warehouse.service;

import java.util.List;

import com.spring.warehouse.model.WhUserType;

public interface UserServiceInter {
WhUserType saveUser(WhUserType user);
List<WhUserType> getAllUserData();
WhUserType getOneUserData(Integer id);
void DeleteUserData(Integer id);

}
