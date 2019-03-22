package com.qa.demo.controllerTests;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.qa.demo.Constants;
import com.qa.demo.controllers.AccountController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountRestTemplateTest {

	@InjectMocks
	AccountController controller;
	@MockBean
	private RestTemplateBuilder rtb;

	@Ignore
	@Test
	public void testNumGenRestBuilder() {
				Mockito.when(rtb.build().exchange(Constants.getNumGen(),HttpMethod.GET, null, String.class)).thenReturn(Constants.getMockGetResponse());
				assertEquals(Constants.getTestAccountNumber(),controller.numberGenerator());
	}
	@Test

	public void microTest() {
		
		Mockito.when(rtb.build().
				exchange(
						Constants.getNumGen(),
				HttpMethod.GET, null,  String.class))
		.thenReturn(Constants.getMockGetResponse());
		
		assertEquals(Constants.getMockGetResponse().getBody(), controller.numberGenerator());

	}
}
