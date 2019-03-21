package com.qa.demo.rest;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.qa.demo.controllers.AccountPrizeController;
import com.qa.sanity.Constants;

@RunWith(SpringRunner.class)
@WebMvcTest(AccountPrizeController.class)
@AutoConfigureMockMvc
public class PrizeDrawEndpointTest {
	
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private AccountPrizeController controller;
	private Constants constants;
	@Before
	public void setup() {
		constants  = new Constants();
	}
	@Test
	public void prizeDrawTest() throws Exception {
		mockMvc.perform(get("/prizeDraw/"+ constants.getEXAMPLE_B6()))
		.andExpect(content().string(containsString(""))); 
	}
}
