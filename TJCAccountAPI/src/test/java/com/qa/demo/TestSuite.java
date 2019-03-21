package com.qa.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.boot.test.context.SpringBootTest;

import com.qa.demo.controllerTests.AccountControllerTest;
import com.qa.demo.entityTests.AccountTest;
import com.qa.demo.repositoryTests.RepositoryTests;
import com.qa.demo.serviceTests.ServiceTests;
import com.qa.demo.smokeTests.SmokeTests;

@RunWith(Suite.class)
@SuiteClasses({ TjCaccountApiApplication.class, AccountTest.class, AccountControllerTest.class, SmokeTests.class, ServiceTests.class, RepositoryTests.class })
@SpringBootTest
public class TestSuite {

}
