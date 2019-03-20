package com.qa.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NumGen8 implements INumGen {
//	private List<String> accountNums = new ArrayList<String>();
	private String accountString = " failed";

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
		int randNumber = new Random().nextInt(99999999) + 10000000;
		accountString=addChar()+randNumber;
		return accountString;
	}
	@Override
	public String toString() {
		genNum();
		return this.accountString.toString();
	}

}
