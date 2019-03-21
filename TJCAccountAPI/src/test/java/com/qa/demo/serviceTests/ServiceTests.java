package com.qa.demo.serviceTests;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.qa.demo.Constants;
import com.qa.demo.entities.Account;
import com.qa.demo.repository.AccountRepo;
import com.qa.demo.service.AccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTests {
	@InjectMocks
	AccountService accountService;
	@Mock
	AccountRepo accountRepo;
	
	
	private List<Account> accountList = Constants.getAccountlist();

	@Before
	public void setup() {
		accountList.add(Constants.getBlankAccount());
		accountList.add(Constants.getNotNullAccount());
		accountList.add(Constants.getTestAccount());
	}

	@After
	public void deconstruct() {
		accountList = Constants.getAccountlist();

	}

	public void searchTest() {

	}

}
