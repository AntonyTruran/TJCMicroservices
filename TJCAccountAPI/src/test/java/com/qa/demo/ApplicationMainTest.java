package com.qa.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationMainTest {
	@Test
	public void mainTest() {
		String arg[] = {""};
		//assertThat(TjCaccountApiApplication.main(arg)).isEqualTo("Program runs successfully");
	}
}
