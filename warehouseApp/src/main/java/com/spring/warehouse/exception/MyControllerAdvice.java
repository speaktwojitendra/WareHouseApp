package com.spring.warehouse.exception;



import org.hibernate.StaleObjectStateException;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;



@ControllerAdvice
public class MyControllerAdvice {
    private static final Logger logger = LoggerFactory.getLogger(MyControllerAdvice.class);

@ExceptionHandler(StaleObjectStateException.class)
public ResponseEntity<String> ShowMessage(Exception ex) {
	 logger.error("StaleObjectStateException occurred: {}", ex.getMessage(), ex);

	return new ResponseEntity<String>("data conflict",HttpStatusCode.valueOf(408));
}
}
