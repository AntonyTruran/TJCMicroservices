package com.qa.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public INumGen genNum1() {
		 return new NumGen6();
	}
	@Bean
	public INumGen genNum2() {
		 return new NumGen8();
	}
	@Bean
	public INumGen genNum3() {
		 return new NumGen10();
	}
}
