package com.qa.demo.controllerTests;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.demo.Constants;
import com.qa.demo.controllers.AccountController;
import com.qa.demo.entities.Account;
import com.qa.demo.entities.AccountBuilder;
import com.qa.demo.service.AccountService;

@RunWith(SpringRunner.class)
@WebMvcTest(AccountController.class)
@AutoConfigureMockMvc
public class AccountControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private AccountService service;
	@MockBean
	private AccountBuilder builder;

	@MockBean
	RestTemplateBuilder rtb;
	@Mock
	Constants constant;
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	private final static Account TEST_ACCOUNT = new Account("first", "last", "b19402");

	@Before
	public void setUp() {
	}

	/*
	 * @Ignore
	 * 
	 * @Test public void testAccountCreation() { String postValue =
	 * OBJECT_MAPPER.writeValueAsString(Constants.getTestAccount());
	 * when(service.createAccount(TEST_ACCOUNT));
	 * mockMvc.perform(MockMvcRequestBuilders.post("/createAccount").contentType(
	 * MediaType.APPLICATION_JSON)
	 * .content(postValue)).andExpect(status().isCreated()).andDo(print()).andReturn
	 * (); Mockito.verify(service).createAccount(constant.getTestAccount()); }
	 */

	@Test
	public void testGetAllAccounts() throws Exception {
		List<Account> MOCKED_ACCOUNTS = new ArrayList<Account>();
		MOCKED_ACCOUNTS.add(Constants.getTestAccount());
		when(service.getAccounts()).thenReturn(MOCKED_ACCOUNTS);
		mockMvc.perform(get("/getAllAccounts")).andExpect(content().string(containsString("Vodka somthing")));
	}

	@Test
	public void testAccountSearch() {
		List<Account> MOCKED_ACCOUNTS = new ArrayList<Account>();
		MOCKED_ACCOUNTS.add(TEST_ACCOUNT);
		Mockito.when(service.accountSearch(TEST_ACCOUNT)).thenAnswer((Answer<?>) invocation -> {
		;
		return invocation;});
		
}
}
