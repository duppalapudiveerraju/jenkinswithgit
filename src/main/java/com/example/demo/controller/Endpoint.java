package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Endpoint {

	@GetMapping("/v1/msg")
	public String getMessage() {
		return "welcome to Jenkins with Spring";
	}
}
