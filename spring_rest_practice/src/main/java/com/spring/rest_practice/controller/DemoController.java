package com.spring.rest_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
@GetMapping("/demo/{email}")
public String demoController(@PathVariable("email")String  mail) {
	return "This is the demo for rest controller for"+mail;
}
}
