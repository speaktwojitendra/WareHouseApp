package com.spring.rest_practice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.spring.rest_practice.controller.DemoController;
import jakarta.servlet.http.HttpServletResponse;

@ControllerAdvice
public class ControllerAdvise1 {

    private final DemoController demoController;

    ControllerAdvise1(DemoController demoController) {
        this.demoController = demoController;
    }
@ExceptionHandler(ArithmeticException.class)
public ResponseEntity<String> handleException(ArithmeticException Ar,HttpServletResponse response){
	System.out.println(Ar.getMessage());
	String s="you should not divide with zero";
	response.setStatus(505);
	return new ResponseEntity<String>(s,HttpStatus.INTERNAL_SERVER_ERROR);
	
}
}
