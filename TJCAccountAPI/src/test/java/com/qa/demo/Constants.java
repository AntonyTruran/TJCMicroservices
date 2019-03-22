package com.qa.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.qa.demo.entities.Account;

public class Constants {

	private final static String TEST_FIRST_NAME = "First";
	private final static String TEST_LAST_NAME = "Last";
	private final static String TEST_ACCOUNT_NUMBER = "b19402";
	private final static String TEST_FIRST_NAME2 = "Furst";
	private final static String TEST_LAST_NAME2 = "Lest";
	private final static String TEST_ACCOUNT_NUMBER2 = "b68381";
	private final static String NA_STRING = "N/A";
	private final static Account NOT_NULL_ACCOUNT = new Account(NA_STRING, NA_STRING, NA_STRING);
	private final static Account TEST_ACCOUNT = new Account(TEST_FIRST_NAME, TEST_LAST_NAME, TEST_ACCOUNT_NUMBER);
	private final static Account TEST_ACCOUNT2 = new Account(TEST_FIRST_NAME2, TEST_LAST_NAME2, TEST_ACCOUNT_NUMBER2);
	private final static Account BLANK_ACCOUNT = new Account();
	private final static List<Account> accountList = new ArrayList<Account>();
	private static final String CREATION_RETURN = "account created";
	private static final String NUM_GEN = "HTTP://localhost:8081/randomNumber";
	private static final ResponseEntity<String> MOCK_GET_RESPONSE = new ResponseEntity<>("b19402",  HttpStatus.OK);
	
	public List<Account> getAccountlist() {
		return accountList;
	}
	public static String getTestFirstName2() {
		return TEST_FIRST_NAME2;
	}

	public static String getTestLastName2() {
		return TEST_LAST_NAME2;
	}

	public static String getTestAccountNumber2() {
		return TEST_ACCOUNT_NUMBER2;
	}

	public static Account getTestAccount2() {
		return TEST_ACCOUNT2;
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
	public String getCreationReturn() {
		return CREATION_RETURN;
	}
	
	public static Account getNotNullAccount() {
		return NOT_NULL_ACCOUNT;
	}
	public static String getNumGen() {
		return NUM_GEN;
	}
	public static ResponseEntity<String> getMockGetResponse() {
		return MOCK_GET_RESPONSE;
	}

}
