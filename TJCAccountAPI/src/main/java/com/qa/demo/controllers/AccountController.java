package com.qa.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.demo.entities.Account;
import com.qa.demo.entities.AccountBuilder;
import com.qa.demo.service.AccountService;

@RestController
@CrossOrigin
public class AccountController {
	
	private AccountService accountService;
	private AccountBuilder accountBuilder;
	
	public AccountController(AccountService accountService, AccountBuilder accountBuilder) {
		this.accountService = accountService;
		this.accountBuilder = accountBuilder;
	}
	
	@PostMapping("/createAccount")
	
	public String createAccount(@RequestBody Account account) {
		account.setAccountNum(numberGenerator());
		this.accountService.createAccount(account);
		return "created";
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
	@GetMapping("/prizeDraw/{accountNum}")
	public String haveYouWon(@PathVariable String accountNum) {
		return rtb.build().exchange("HTTP://localhost:8082/prizeDraw/" + accountNum , HttpMethod.GET,null,String.class).getBody();
	}
}
