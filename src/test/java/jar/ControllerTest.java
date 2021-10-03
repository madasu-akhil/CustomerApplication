package jar;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import jar.controller.CustomerController;
import jar.model.Customer;
import jar.service.CustomerService;
import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {

	@Mock
	private CustomerService service;
	
	@InjectMocks
	private CustomerController controller;
	
	
	public void getCustomerListTest() throws Exception{
List<Customer> customerList = new ArrayList<Customer>();
		
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		
		customerList.add(customer1);
		customerList.add(customer2);
		
		Mockito.when(service.getAllCustomers()).thenReturn(customerList);
		
		ResponseEntity<List<Customer>> response = controller.getAllCustomers();
		
		Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
	}
	
	
}
