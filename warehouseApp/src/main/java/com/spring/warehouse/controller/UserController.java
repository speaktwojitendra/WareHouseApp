package com.spring.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.warehouse.model.WhUserType;
import com.spring.warehouse.service.UserServiceInter;
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserServiceInter userInter;
	
@GetMapping("/register")
public String ShowRegisterPage() {
	return "UserRegister";
}
@PostMapping("/save")
public String SaveUser(@ModelAttribute WhUserType user,Model model) {
	userInter.saveUser(user);
	model.addAttribute("list",userInter.getAllUserData());
	
	return "UserData";
}
@GetMapping("/edit")
public String ShowEdit(@RequestParam Integer id,Model model) {
	model.addAttribute("obj", userInter.getOneUserData(id));
	
	return "UserEdit";
}
@GetMapping("/delete")
public String deleteUser(Integer id,Model model) {
	userInter.DeleteUserData(id);
model.addAttribute("list",userInter.getAllUserData());
	
	return "UserData";
}
@PostMapping("/update")
public String updateUser(@ModelAttribute WhUserType user,Model model) {
	userInter.saveUser(user);
model.addAttribute("list",userInter.getAllUserData());
	
	return "UserData";
	
}
}
