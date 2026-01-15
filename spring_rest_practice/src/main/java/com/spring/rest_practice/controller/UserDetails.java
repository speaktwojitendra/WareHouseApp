package com.spring.rest_practice.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDetails {
	@NotNull(message = "id should not null")	
int id;
@NotBlank(message = "Name should not empty or null")
@Size( min = 5,max = 15, message = "name should be min 5 and max 10 letters")
String name;
int age;
String password;

}
