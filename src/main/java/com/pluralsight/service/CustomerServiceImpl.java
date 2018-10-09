package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CustomerServiceImpl implements CustomerService {

	public CustomerServiceImpl() {
	}
	
	private CustomerRepository customerRepository;
	
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("kjdfhkshdkj");
		this.customerRepository = customerRepository;
	}

	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("jflkj");
		this.customerRepository = customerRepository;
	}


	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
}
