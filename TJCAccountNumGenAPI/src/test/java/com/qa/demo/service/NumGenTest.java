package com.qa.demo.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NumGenTest {
	private NumGen6 gen6;
	private NumGen8 gen8;
	private NumGen10 gen10;
	private String res;
	@Before
	public void setup() {
		gen6 = new NumGen6();
		gen8 = new NumGen8();
		gen10 = new NumGen10();
		res = "abc";
	}
	
	@Test
	public void gen6CharTest() {
		assertTrue(res.contains(gen6.addChar()));
	}
	
	@Test
	public void gen8CharTest() {
		assertTrue(res.contains(gen8.addChar()));
	}
	
	@Test
	public void gen10CharTest() {
		assertTrue(res.contains(gen10.addChar()));
	}
	
	@Test
	public void gen6LengthTest() {
		assertEquals(6, gen6.genNum().length());
	}
	
	@Test
	public void gen8LengthTest() {
		assertEquals(8, gen8.genNum().length());
	}
	
	@Test
	public void gen10LengthTest() {
		assertEquals(10, gen10.genNum().length());
	}
}
