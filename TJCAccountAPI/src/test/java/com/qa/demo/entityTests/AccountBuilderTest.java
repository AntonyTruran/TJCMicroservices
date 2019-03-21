package com.qa.demo.entityTests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.demo.entities.Account;
import com.qa.demo.entities.AccountBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountBuilderTest {

	@Autowired
	private static AccountBuilder accountBuilder;

	private Account notNullAccount = new Account("N/A", "N/A", "N/A");
	private Account testAccount1 = new Account("First", "Last", "b19402");

	@Before
	public void getBuilder() {
		accountBuilder = AccountBuilder.getBuilder();
		assertThat(accountBuilder).isNotNull();
	}

	@After
	public void resetBuilder() {
		accountBuilder = AccountBuilder.getBuilder();
		assertThat(accountBuilder).isNotNull();
	}
	
	@Test
	public void blankBuild() {
		assertThat(accountBuilder.accountBuild().matches(notNullAccount));
	}
	
	@Test
	public void setterBuild() {
		assertThat(accountBuilder.firstName("First").lastName("Last").accountNum("b19402").accountBuild()
				.matches(testAccount1));

	}

}
