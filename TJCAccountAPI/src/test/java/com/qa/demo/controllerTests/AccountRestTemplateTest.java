package com.qa.demo.controllerTests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.demo.Constants;
import com.qa.demo.controllers.AccountController;

@RunWith(SpringRunner.class)
public class AccountRestTemplateTest {

	@InjectMocks
	AccountController controller;
	@MockBean
	RestTemplateBuilder rtb;

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
