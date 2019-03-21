package com.qa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class TjCaccountApiApplication {

	public static String main(String[] args) {
		SpringApplication.run(TjCaccountApiApplication.class, args);
		return("Program runs successfully");
	}

}
