package com.spring.fundamentals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.fundamentals.model.Customer;
import com.spring.fundamentals.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//Autowired - Member Variable
	@Autowired
	private CustomerRepository customerRepository;

	/* (non-Javadoc)
	 * @see com.spring.fundamentals.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	//Autowired - Setter Injection
	/*@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Autowired - Setter Injection");
		this.customerRepository = customerRepository;
	}*/


	//Autowired - Constructor Injection
	/*@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("Autowired - Constructor Injection");
		this.customerRepository = customerRepository;
	}*/
}
