package com.qa.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {

	public Account(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Account(String firstName, String lastName, String accountNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNum = accountNum;
	}

	public Account() {

	}

	@Id
	@GeneratedValue
	private long id;
	private String firstName;
	private String lastName;
	private String accountNum;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String surname) {
		this.lastName = surname;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public long getID() {
		return id;
	}

}