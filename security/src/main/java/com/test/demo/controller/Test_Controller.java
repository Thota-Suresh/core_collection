package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test_Controller {

	@GetMapping("/wish")
	public String wish() {
		return "hello";
	}
}
