package com.qa.demo.serviceTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.any;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.qa.demo.Constants;
import com.qa.demo.entities.Account;
import com.qa.demo.repository.AccountRepo;
import com.qa.demo.service.AccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceTest {
	@InjectMocks
	AccountService accountService;
	@Mock
	AccountRepo accountRepo;

	private List<Account> accountList = new ArrayList<Account>();

	@Before
	public void setup() {
		accountList.add(Constants.getNotNullAccount());
		accountList.add(Constants.getTestAccount());
	}

	@After
	public void deconstruct() {
		accountList.clear();
	}

	@Test
	public void searchTest() {
		Mockito.when(accountRepo.findAll()).thenReturn(accountList);
		assertThat(accountService.accountSearch(Constants.getTestAccount()).get(0).matches(Constants.getTestAccount()));
	}

	@Test
	public void addAccount() {
		Account accountToSave = Constants.getTestAccount2();
		
		Mockito.when(accountRepo.save(accountToSave)).thenAnswer((Answer<?>) invocation -> {
			accountList.add(accountToSave);
			return Constants.getBlankAccount();
		});
		
		Mockito.when(accountRepo.findAll()).thenReturn(accountList);
		accountService.createAccount(Constants.getTestAccount2());
		assertThat(accountService.accountSearch(accountToSave).get(0).matches(accountToSave));
	}

}
