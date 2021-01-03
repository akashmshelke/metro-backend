package com.pmtt.metro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metro")
public class TestController {
	 @GetMapping("/test")
     public String hello() {
         return "Hello Spring Boot!!";
    }
}
