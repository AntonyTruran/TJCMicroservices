package com.qa.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.demo.controllers.AccountPrizeController;
import com.qa.demo.suite.TestSuite;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

	@Autowired
	private AccountPrizeController controller;
	private TjcAccountNumPrizeApiApplication app;
	private TestSuite suite;
	@Before
	public void setup() {
		suite = new TestSuite();
		app = new TjcAccountNumPrizeApiApplication();
	}
	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}
	@Test
	public void suiteExists() {
		assertThat(suite).isNotNull();
	}
	@Test
	public void appRuns() {
		String[] args = new String[] {"Hello World"};
		app.main(args);
	}
}
