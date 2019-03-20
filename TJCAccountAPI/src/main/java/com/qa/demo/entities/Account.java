package com.qa.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
public class Account {
	
	public Account(String firstName, String surname, String accountNum) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.accountNum = accountNum;
	}
	@Id
	@GeneratedValue
	private long id;
	private String firstName;
	private String surname;
	private String accountNum;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return surname;
	}
	public void setSecondName(String surname) {
		this.surname = surname;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	

}