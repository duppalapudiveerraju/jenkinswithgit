package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringwithJenkinsApplication {


	 public static final Logger logger = LoggerFactory.getLogger(SpringwithJenkinsApplication.class); 
	public static void main(String[] args) {
		logger.info("==========welcome to jenkins========");
		SpringApplication.run(SpringwithJenkinsApplication.class, args);
		
	}

}
