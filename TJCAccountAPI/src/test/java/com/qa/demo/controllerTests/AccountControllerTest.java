/*
 * package com.qa.demo.controllerTests;
 * 
 * import static org.junit.Assert.assertEquals;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.junit.Before; import org.junit.Test; import
 * org.junit.runner.RunWith; import org.mockito.InjectMocks; import
 * org.mockito.Mock; import org.mockito.Mockito; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
 * import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
 * import org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.boot.web.client.RestTemplateBuilder; import
 * org.springframework.test.context.junit4.SpringRunner;
 * 
 * import com.qa.demo.Constants; import
 * com.qa.demo.controllers.AccountController; import
 * com.qa.demo.entities.Account; import com.qa.demo.entities.AccountBuilder;
 * import com.qa.demo.service.AccountService;
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @WebMvcTest(AccountController.class)
 * 
 * @AutoConfigureMockMvc public class AccountControllerTest {
 * 
 * @InjectMocks private AccountController accountController;
 * 
 * @Mock private AccountService service;
 * 
 * @Mock private AccountBuilder builder;
 * 
 * @Mock RestTemplateBuilder rtb;
 * 
 * @Mock Constants constant;
 * 
 * @Before public void setUp() { constant = new Constants(); }
 * 
 * @Test public void testAccountCreation() {
 * Mockito.when(accountController.createAccount(constant.getTestAccount()).
 * thenReturn("created")); assertEquals("created",
 * accountController.createAccount(constant.getTestAccount()));
 * Mockito.verify(service).createAccount(constant.getTestAccount()); }
 * 
 * @Test public void testGetAllAccounts() { List<Account> MOCKED_ACCOUNTS = new
 * ArrayList<>(); MOCKED_ACCOUNTS.add(constant.getTestAccount());
 * Mockito.when(service.getAccounts()).thenReturn(MOCKED_ACCOUNTS);
 * assertEquals(MOCKED_ACCOUNTS, accountController.getAccounts()); } }
 */