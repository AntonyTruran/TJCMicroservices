package com.qa.demo.entityTests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.demo.entities.Account;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountTest {
	
	private Account blankAccount = new Account();
	private Account testAccount1 = new Account("First", "Last", "b19402");
	
	@Test
	public void blankTest() {
		assertNull("First name field should be blank", blankAccount.getFirstName());
		assertNull("Last name field should be blank",blankAccount.getLastName());
		assertNull("Account Number field should be blank",blankAccount.getAccountNum());
		assertNotNull("Account object should not be null",blankAccount);
	}
	
	

}
