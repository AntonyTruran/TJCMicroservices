package com.qa.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.demo.AccountBuilder;
import com.qa.demo.entities.Account;
import com.qa.demo.service.AccountService;

@RestController
public class AccountController {
	
	private AccountService accountService;
	private AccountBuilder accountBuilder;
	
	public AccountController(AccountService accountService, AccountBuilder accountBuilder) {
		this.accountService = accountService;
		this.accountBuilder = accountBuilder;
	}
	
	@PostMapping("/createAccount")
	public void createAccount(String firstName, String lastName) {
		Account account = new Account(firstName, lastName);
		account.setAccountNum(numberGenerator());
		this.accountService.createAccount(account);
	}
	
	@GetMapping("/getAllAccounts")
	public List<Account> getAccounts() {
		return this.accountService.getAccounts();
	}
	
	@GetMapping("/accountSearch")
	public List<Account> accountSearch(String firstName, String lastName, String accountNum){
		return this.accountService.accountSearch(accountBuilder.firstName(firstName).lastName(lastName).accountNum(accountNum).accountBuild());
	}

	@Autowired
	RestTemplateBuilder rtb;

	@GetMapping("/hello")
	public String hello() {
		return rtb.build().exchange("HTTP://localhost:8081/hello", HttpMethod.GET,null,String.class).getBody();
	}
	@GetMapping("/randomNumber")
	public String numberGenerator() {
		String accountNum = rtb.build().exchange("HTTP://localhost:8081/randomNumber", HttpMethod.GET,null,String.class).getBody();
		return accountNum;
	}
	@GetMapping("/prizeDraw")
	public String haveYouWon() {
		return rtb.build().exchange("HTTP://localhost:8082/prizeDraw", HttpMethod.GET,null,String.class).getBody();
	}
}
