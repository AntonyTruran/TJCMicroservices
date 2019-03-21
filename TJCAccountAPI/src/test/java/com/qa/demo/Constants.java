package com.qa.demo;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;

import com.qa.demo.entities.Account;

public class Constants {
	
	private final static String TEST_FIRST_NAME = "First";
	private final static String TEST_LAST_NAME ="Last";
	private final static String TEST_ACCOUNT_NUMBER ="b19402";
	private final static String NA_STRING = "N/A";
	private final static Account NOT_NULL_ACCOUNT = new Account(NA_STRING, NA_STRING, NA_STRING);
	private final static Account TEST_ACCOUNT = new Account(TEST_FIRST_NAME, TEST_LAST_NAME, TEST_ACCOUNT_NUMBER);
	private final static Account BLANK_ACCOUNT = new Account();
	private final static List<Account> accountList = new ArrayList<Account>();
	private static final String CREATION_RETURN = "account created";
	
	public List<Account> getAccountlist() {
		return accountList;
	}
	public Account getNotNullAccount() {
		return NOT_NULL_ACCOUNT;
	}
	public Account getTestAccount() {
		return TEST_ACCOUNT;
	}
	public String getTestFirstName() {
		return TEST_FIRST_NAME;
	}
	public String getTestLastName() {
		return TEST_LAST_NAME;
	}
	public String getTestAccountNumber() {
		return TEST_ACCOUNT_NUMBER;
	}
	public String getNaString() {
		return NA_STRING;
	}
	public Account getBlankAccount() {
		return BLANK_ACCOUNT;
	}
	public String getCreationReturn() {
		return CREATION_RETURN;
	}
	

}
 