package com.qa.demo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountPrizeControllerTest {
	private AccountPrizeController controller;
	
	private static final String STARTS_A = "Unfortunately On This Occasssion You Have Not Won A Prize.";
	private static final String STARTS_B_6 = "You Have Won $50";
	private static final String STARTS_C_6 = "You Have Won $100";
	private static final String STARTS_B_8 = "You Have Won $500";
	private static final String STARTS_C_8 = "You Have Won $750";
	private static final String STARTS_B_10 = "You Have Won $5000";
	private static final String STARTS_C_10 = "You Have Won $10000";
	private static final String FOUND_ERROR = "There Was An Unexpected Error";
	@Before
	public void setup() {
		controller = new AccountPrizeController();
	}
	
	@Test
	public void testDrawPrizeWithA() {
		assertEquals(STARTS_A,controller.drawPrize("a085218071"));
	}

	@Test
	public void testDrawPrizeWithB6() {
		assertEquals(STARTS_B_6,controller.drawPrize("b12212"));
	}
	@Test
	public void testDrawPrizeWithB8() {
		assertEquals(STARTS_B_8,controller.drawPrize("b3258449"));
	}
	@Test
	public void testDrawPrizeWithB10() {
		assertEquals(STARTS_B_10,controller.drawPrize("b523287366"));
	}
	@Test
	public void testDrawPrizeWithC6() {
		assertEquals(STARTS_C_6,controller.drawPrize("c96201"));
	}
	@Test
	public void testDrawPrizeWithC8() {
		assertEquals(STARTS_C_8,controller.drawPrize("c7915088"));
	}
	@Test
	public void testDrawPrizeWithC10() {
		assertEquals(STARTS_C_10,controller.drawPrize("c352873583"));
	}
	@Test
	public void testDrawPrizeError() {
		assertEquals(FOUND_ERROR,controller.drawPrize("d4660608"));
	}
}
