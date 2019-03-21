package com.qa.demo.entityTests;

import static org.assertj.core.api.Assertions.assertThat;
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
	private Account notNullAccount = new Account("N/A", "N/A", "N/A");
	private Account testAccount1 = new Account("First", "Last", "b19402");
	
	@Test
	public void blankAccountTest() {
		assertNull("First name field should be blank", blankAccount.getFirstName());
		assertNull("Last name field should be blank",blankAccount.getLastName());
		assertNull("Account Number field should be blank",blankAccount.getAccountNum());
		assertNotNull("Account object should not be null",blankAccount);
		assertNotNull("ID should not be null",blankAccount.getID());
	}
	
	@Test
	public void fullAccountTest() {
		Account account1 = new Account();
		account1.setFirstName("First");
		account1.setLastName("Last");
		account1.setAccountNum("b19402");
		assertThat(account1.matches(testAccount1));
	}
	
	@Test
	public void blankSearchTest() {
		assertThat(testAccount1.matches(notNullAccount));
		
	}
}
