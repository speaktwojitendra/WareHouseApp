package com.spring.employee.service;

public class UserNotFoundException extends RuntimeException {
UserNotFoundException(String message){
	super(message);
}
}
