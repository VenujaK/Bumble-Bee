package com.example.Bumblebee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Bumblebee.domain.Customer;
import com.example.Bumblebee.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
    private CustomerRepository repo;

	public List<Customer> listAllCus() {
        return repo.findAll();
    }
    
    public void saveAllCus(Customer cust) {
        repo.save(cust);
    }
//    
//    public Customer get(long cid) {
//        return repo.findById(cid).get();
//    }
	
//	@Autowired
//	private CustomerRepository repo;
//	  
//	  public Login login(String username, String password) {
//	  Login user = repo.findByUsernameAndPassword(username, password);
//	   return user;
//	  }

}
