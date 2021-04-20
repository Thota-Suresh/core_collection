package com.example.eureka1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MyController {

	@GetMapping("display")
	public String display() {
		return "hello";
	}
}
