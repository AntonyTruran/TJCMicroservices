package com.qa.demo.entityTests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.demo.Constants;
import com.qa.demo.entities.AccountBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountBuilderTest {

	@Autowired
	private static AccountBuilder accountBuilder;

	@Before
	public void getBuilder() {
		accountBuilder = accountBuilder.getBuilder();
		assertThat(accountBuilder).isNotNull();
	}

	@After
	public void resetBuilder() {
		accountBuilder = accountBuilder.getBuilder();
		assertThat(accountBuilder).isNotNull();
	}

	@Test
	public void blankBuild() {
		assertThat(accountBuilder.accountBuild().matches(Constants.getNotNullAccount()));
	}

	@Test
	public void setterBuild() {
		assertThat(accountBuilder.firstName(Constants.getTestFirstName()).lastName(Constants.getTestLastName())
				.accountNum(Constants.getTestAccountNumber()).accountBuild().matches(Constants.getTestAccount()));

	}

}
