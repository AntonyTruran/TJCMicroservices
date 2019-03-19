package com.qa.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.demo.entities.Account;
import com.qa.demo.service.AccountService;

@RestController
public class AccountController {

	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}

	private AccountService accountService;
	
	@PostMapping("/createAccount")
	public void createAccount(Account account) {
		this.accountService.createAccount(account);
	}
	
	@GetMapping("/getAccount")
	public List<Account> getAccounts() {
		return this.accountService.getAccounts();
		
	}
	
}
