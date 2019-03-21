
package com.qa.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.boot.test.context.SpringBootTest;

import com.qa.demo.controllerTests.AccountControllerTest;
import com.qa.demo.entityTests.AccountBuilderTest;
import com.qa.demo.entityTests.AccountTest;
import com.qa.demo.repositoryTests.AccountRepoTest;
import com.qa.demo.serviceTests.AccountServiceTest;
import com.qa.demo.smokeTests.SmokeTest;

@RunWith(Suite.class)

@SuiteClasses({AccountTest.class, SmokeTest.class, AccountServiceTest.class,
		AccountBuilderTest.class, AccountRepoTest.class, ApplicationMainTest.class, AccountControllerTest.class })

@SpringBootTest
public class TestSuite {

}
