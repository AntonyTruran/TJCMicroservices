package com.qa.demo;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TjcAccountNumGenApiApplication {
	private static ApplicationContext ac;
	public static void main(String[] args) {
		ac = SpringApplication.run(TjcAccountNumGenApiApplication.class, args);
	}
	
	@GetMapping("/randomNumber")
	public String number() {
		String generatedNumber = "unset";
		int option= new Random().nextInt(3);
		if (option == 0) {
			generatedNumber = ac.getBean("genNum1").toString();
		} else if (option == 1) {	
			generatedNumber = ac.getBean("genNum2").toString();
		} else if (option == 2) {
			generatedNumber = ac.getBean("genNum3").toString();
		}
		return generatedNumber;
	}
}
