package com.qa.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountPrizeController {

	@GetMapping("/prizeDraw/{accountNum}")
	public String drawPrize(@PathVariable("accountNum") String accountNum) {
		System.out.println(accountNum);
		switch (accountNum.charAt(0)) {
		case 'a': {
			return "Unfortunately On This Occasssion You Have Not Won A Prize.";
		}
		case 'b': {
			switch (accountNum.length()) {
			case 6: {
				return "You Have Won $50";
			}
			case 8: {
				return "You Have Won $500";
			}
			case 10: {
				return "You Have Won $5000";
			}
			}
		}
		case 'c': {
			switch (accountNum.length()) {
			case 6: {
				return "You Have Won $100";
			}
			case 8: {
				return "You Have Won $750";
			}
			case 10: {
				return "You Have Won $10000";
			}
			}
		}
		default: {
			return "There Was An Unexpected Error";
		}
		}
	}
}
