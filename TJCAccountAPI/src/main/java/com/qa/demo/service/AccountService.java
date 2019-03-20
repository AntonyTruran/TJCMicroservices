package com.qa.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.demo.entities.Account;
import com.qa.demo.repository.AccountRepo;

@Service
public class AccountService {

	private AccountRepo accountRepo;

	public AccountService(AccountRepo accountRepo) {
		this.accountRepo = accountRepo;
	}

	public void createAccount(String firstname, String lastname, String accountNumber) {	
		Account account = new Account(firstname,lastname,accountNumber);
		this.accountRepo.save(account);
	}
	
	public List<Account> getAccounts() {
		return this.accountRepo.findAll();		
	}

}