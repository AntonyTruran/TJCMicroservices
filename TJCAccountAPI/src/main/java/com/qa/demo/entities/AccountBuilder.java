
package com.qa.demo.entities;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class AccountBuilder {
	private String firstName = "";
	private String lastName = "";
	private String accountNum = "";
	private static AccountBuilder accountBuilder;

	private AccountBuilder() {
	}

	public AccountBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public AccountBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public AccountBuilder accountNum(String accountNum) {
		this.accountNum = accountNum;
		return this;
	}

	public Account accountBuild() {
		Account account = new Account(Optional.ofNullable(this.firstName).orElse("N/A"),
				Optional.ofNullable(this.lastName).orElse("N/A"),
				Optional.ofNullable(this.accountNum).orElse("N/A"));
		accountBuilder = null;
		return account;
	}

	public static AccountBuilder getBuilder() {
		if (accountBuilder == null) {
			accountBuilder = new AccountBuilder();
		}
		return accountBuilder;
	}

}
