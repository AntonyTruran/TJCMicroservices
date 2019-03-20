package com.qa.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NumGen10 implements INumGen {
	private List<String> accountNums = new ArrayList<String>();
	private String accountString= "failed";

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
		String number = "";
		int randNumber;
		for (int i=1; i<10;i++) {
			 randNumber = new Random().nextInt(9) + 0;
			number += randNumber;
		}
		accountString=addChar()+number;
		return accountString;
	}
	@Override
	public String toString() {
		genNum();
		return this.accountString;
	}
}
