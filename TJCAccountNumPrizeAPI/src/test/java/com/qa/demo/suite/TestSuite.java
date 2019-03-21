package com.qa.demo.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.qa.demo.SmokeTest;
import com.qa.demo.controllers.AccountPrizeControllerTest;

@RunWith(Suite.class)
@SuiteClasses({AccountPrizeControllerTest.class, SmokeTest.class })
public class TestSuite {

}
