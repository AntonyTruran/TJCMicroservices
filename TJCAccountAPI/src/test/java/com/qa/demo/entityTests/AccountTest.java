package com.qa.demo.entityTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.demo.entities.Account;
import com.qa.demo.Constants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountTest {

	@Test
	public void blankAccountTest() {
		assertNull(Constants.getBlankAccount().getFirstName());
		assertNull(Constants.getBlankAccount().getLastName());
		assertNull(Constants.getBlankAccount().getAccountNum());
		assertNotNull(Constants.getBlankAccount());
		assertNotNull(Constants.getBlankAccount().getID());
	}

	@Test
	public void fullAccountTest() {
		Account account1 = new Account();
		account1.setFirstName(Constants.getTestFirstName());
		account1.setLastName(Constants.getTestLastName());
		account1.setAccountNum(Constants.getTestAccountNumber());
		assertThat(account1.matches(Constants.getTestAccount()));
	}

	@Test
	public void blankSearchTest() {
		assertThat(Constants.getTestAccount().matches(Constants.getNotNullAccount()));

	}
}