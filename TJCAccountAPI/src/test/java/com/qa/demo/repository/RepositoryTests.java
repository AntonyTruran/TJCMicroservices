package com.qa.demo.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.qa.demo.repository.AccountRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTests {

	@Autowired
	AccountRepo accountRepo;

	@Test 
	public void contextLoads() {
		assertThat(accountRepo).isNotNull();
	}
}
