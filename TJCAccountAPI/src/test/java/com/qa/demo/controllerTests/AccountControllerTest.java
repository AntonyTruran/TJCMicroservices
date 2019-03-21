package com.qa.demo.controllerTests;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.demo.controllers.AccountController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountControllerTest {
	
	@Autowired
	private AccountController accountController;
	
}
