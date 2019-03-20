package com.qa.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public void createAccount(String firstName, String lastName) {
		Account account = new Account(firstName, lastName);
		account.setAccountNum(numberGenerator());
		this.accountService.createAccount(account);
	}
	
	@GetMapping("/getAccount")
	public List<Account> getAccounts() {
		return this.accountService.getAccounts();
		
	}
	@Autowired
	RestTemplateBuilder rtb;

	@GetMapping("/hello")
	public String hello() {
		return rtb.build().exchange("HTTP://localhost:8081/hello", HttpMethod.GET,null,String.class).getBody();
	}
	@GetMapping("/randomNumber")
	public String numberGenerator() {
		String accountNumber = rtb.build().exchange("HTTP://localhost:8081/randomNumber", HttpMethod.GET,null,String.class).getBody();
		return accountNumber;
	}
	@GetMapping("/prizeDraw/{accountNum}")
	public String haveYouWon(@PathVariable String accountNum) {
		return rtb.build().exchange("HTTP://localhost:8082/prizeDraw/" + accountNum , HttpMethod.GET,null,String.class).getBody();
	}
}
