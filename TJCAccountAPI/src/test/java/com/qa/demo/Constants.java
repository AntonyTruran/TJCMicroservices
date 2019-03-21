package com.qa.demo;

import com.qa.demo.entities.Account;

public class Constants {
	
	private final static String TEST_FIRST_NAME = "First";
	private final static String TEST_LAST_NAME ="Last";
	private final static String TEST_ACCOUNT_NUMBER ="b19402";
	private final static String NA_STRING = "N/A";
	private final static Account NOT_NULL_ACCOUNT = new Account(NA_STRING, NA_STRING, NA_STRING);
	private final static Account TEST_ACCOUNT = new Account(TEST_FIRST_NAME, TEST_LAST_NAME, TEST_ACCOUNT_NUMBER);
	private static Account BLANK_ACCOUNT = new Account();
	
	public static Account getNotNullAccount() {
		return NOT_NULL_ACCOUNT;
	}
	public static Account getTestAccount() {
		return TEST_ACCOUNT;
	}
	public static String getTestFirstName() {
		return TEST_FIRST_NAME;
	}
	public static String getTestLastName() {
		return TEST_LAST_NAME;
	}
	public static String getTestAccountNumber() {
		return TEST_ACCOUNT_NUMBER;
	}
	public static String getNaString() {
		return NA_STRING;
	}
	public static Account getBlankAccount() {
		return BLANK_ACCOUNT;
	}
	

}
 