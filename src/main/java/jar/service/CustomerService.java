package jar.service;

import java.util.List;
import java.util.Optional;

import jar.model.Customer;

public interface CustomerService {

	List<Customer> getAllCustomers();

	Customer save(Customer details);

	Optional<Customer> getCustomerById(Long id);

	Customer updateCustomer(Customer cust, Long id);

	void deleteCustomer(Long id);

}
