package com.qa.demo.controllerTests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.demo.Constants;
import com.qa.demo.controllers.AccountController;
import com.qa.demo.entities.AccountBuilder;
import com.qa.demo.service.AccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountControllerTest {
	
	@InjectMocks
	private AccountController accountController;
	
	@Mock
	private AccountService service;
	@Mock
	private AccountBuilder builder;
	
	@Mock
	RestTemplateBuilder rtb;
	@Mock
	Constants constant;
	
	@Test
	public void testAccountCreation() {
		Mockito.when(service.createAccount(constant.TEST_ACCOUNT_1).thenReturn(constant.CREATED_MESSAGE))
		assertEquals(constant.CREATED_MESSAGE, service.createAccount(constant.TEST_ACCOUNT_1));
	}
	@Test
	public void testGetAllAccounts() {
		
	}
	
}
