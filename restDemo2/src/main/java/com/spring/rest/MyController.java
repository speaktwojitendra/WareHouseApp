package com.spring.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @PostMapping("/hello")
    public String sayHello() {
        return "Hello Guys";
    }
}