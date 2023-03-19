package com.BumbleBee.app.BumbleBee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.BumbleBee.app.entity.Customer;
import com.BumbleBee.app.repository.Customer_repository;

@SpringBootApplication
public class BumbleBeeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BumbleBeeApplication.class, args);
	}

	@Autowired
	private Customer_repository customerRepository;
	@Override
	public void run(String... args) throws Exception {
		Customer customer1 =new  Customer("venuja",18,12511,"Colombo");
		customerRepository.save(customer1);
		
		Customer customer2 =new  Customer("ayesh",18,12511,"Colombo");
		customerRepository.save(customer1);
		
	}

}
