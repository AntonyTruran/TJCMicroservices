package com.qa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.qa.demo.entities.Account;

@SpringBootApplication
@EnableWebMvc
@EnableJms
public class TjCaccountApiApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(TjCaccountApiApplication.class, args);
		//JmsTemplate jmsT = ac.getBean(JmsTemplate.class);
	}
}
