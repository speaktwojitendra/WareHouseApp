package com.spring.mvc.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class MyController {
	@GetMapping("/name")
	@ResponseBody
public String getDetailsOfPhone() {
	return "This is Iphone";
	
}
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
	@GetMapping("/register1")
	
	public String registration() {
		return "register1";
	}
	@PostMapping("/register")
	
	public String registerMessage(@RequestParam String fullname,
            @RequestParam String email,
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String confirmPassword,
            Model model
             ) {
		if(!password.equals(confirmPassword))
		{
			return "error";
		}
		else {
			model.addAttribute("username",username);
			
			return "success";
		}
		
		
	
	}
	
	
} 
