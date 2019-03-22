package com.qa.demo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.sanity.Constants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountPrizeControllerTest {
	private AccountPrizeController controller;
	@Mock
	Constants constants;

	@Before
	public void setup() {
		controller = new AccountPrizeController();
		constants = new Constants();
	}
	
	@Test
	public void testDrawPrizeWithA() {
		assertEquals(constants.getSTARTS_A(),controller.drawPrize("a085218071"));
	}

	@Test
	public void testDrawPrizeWithB6() {
		assertEquals(constants.getSTARTS_B_6(),controller.drawPrize("b12212"));
	}
	@Test
	public void testDrawPrizeWithB8() {
		assertEquals(constants.getSTARTS_B_8(),controller.drawPrize("b3258449"));
	}
	@Test
	public void testDrawPrizeWithB10() {
		assertEquals(constants.getSTARTS_B_10(),controller.drawPrize("b523287366"));
	}
	@Test
	public void testDrawPrizeWithC6() {
		assertEquals(constants.getSTARTS_C_6(),controller.drawPrize("c96201"));
	}
	@Test
	public void testDrawPrizeWithC8() {
		assertEquals(constants.getSTARTS_C_8(),controller.drawPrize("c7915088"));
	}
	@Test
	public void testDrawPrizeWithC10() {
		assertEquals(constants.getSTARTS_C_10(),controller.drawPrize("c352873583"));
	}
	@Test
	public void testDrawPrizeError() {
		assertEquals(constants.getFOUND_ERROR(),controller.drawPrize("d4660608"));
	}
}
