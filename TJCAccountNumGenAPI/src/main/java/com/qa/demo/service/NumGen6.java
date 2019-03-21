package com.qa.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NumGen6 implements INumGen {
	private List<String> accountNums = new ArrayList<String>();
	private String accountString = "failed";
	public String addChar() {
		int firstCharNum = ThreadLocalRandom.current().nextInt(0, 3);
		switch (firstCharNum) {
		case 0: {
			return "a";
		}
		case 1: {
			return "b";
		}
		case 2: {
			return "c";
		}
		default: {
			return "0";
		}
		}
	}

	@Override
	public String genNum() {
		Boolean newCheck = true;
		while (newCheck) {
			accountString = addChar();
			for (int i = 0; i < 5; i++) {
				String digit = String.valueOf(ThreadLocalRandom.current().nextInt(0, 10));
				accountString += digit;
			}
			newCheck = accountNums.contains(accountString);
		}
		return accountString;
	}
	
	@Override
	public String toString() {
		genNum();
		return this.accountString;
	}

}
