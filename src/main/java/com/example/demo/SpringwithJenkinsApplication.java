package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringwithJenkinsApplication {

	public static void main(String[] args) {
		System.out.println("Hello jenkins");
		SpringApplication.run(SpringwithJenkinsApplication.class, args);
	}

}
