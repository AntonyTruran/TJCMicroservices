package com.qa.demo.entities;

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

	public boolean matches(Account account) {
		return (this.getFirstName().contentEquals(account.getFirstName())
				|| account.getFirstName().contentEquals("N/A"))
				&& (this.getLastName().contentEquals(account.getLastName())
						|| account.getLastName().contentEquals("N/A"))
				&& (this.getAccountNum().contentEquals(account.getAccountNum())
						|| account.getAccountNum().contentEquals("N/A"));
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNum + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}

}
