package com.BumbleBee.app.impl;
import com.BumbleBee.app.service.CustomerService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BumbleBee.app.entity.Customer;
import com.BumbleBee.app.repository.Customer_repository;
import com.BumbleBee.app.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	private Customer_repository customerRepository ;
	
	public CustomerServiceImpl(Customer_repository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
}
