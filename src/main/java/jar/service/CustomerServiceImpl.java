package jar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jar.model.Customer;
import jar.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository repository;
	
	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customer = new ArrayList<>();
		
		customer = repository.findAll();
		return customer;
	}

	@Override
	public Customer save(Customer details) {
		
		Customer customer = repository.save(details);
		return customer;
	}

	@Override
	public Optional<Customer> getCustomerById(Long id) {
		return repository.findById(id);
		
		
	}

	@Override
	public Customer updateCustomer(Customer cust, Long id) {
		Optional<Customer> categoryToUpdate = repository.findById(id);
		Customer updatedCustomer = null;
		if(null != categoryToUpdate) {
			updatedCustomer = repository.save(cust); 
			 return cust;
		}
		 return updatedCustomer;
	}

	@Override
	public void deleteCustomer(Long id) {
		repository.deleteById(id);
		
	}

}
