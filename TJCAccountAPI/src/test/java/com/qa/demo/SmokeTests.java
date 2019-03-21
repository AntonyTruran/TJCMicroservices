package com.qa.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertNotNull;
import org.junit.Assert.*;

import com.qa.demo.controllers.AccountController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTests {
	
	@Autowired
	private AccountController accountController;

	@Test
	public void contextLoads() {
		assertNotNull(accountController);
	}

}
