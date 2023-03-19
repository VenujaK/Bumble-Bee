package com.BumbleBee.app.BumbleBee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.BumbleBee.app.entity.Customer;
import com.BumbleBee.app.entity.Order;
import com.BumbleBee.app.entity.Product;
import com.BumbleBee.app.repository.Customer_repository;
import com.BumbleBee.app.repository.Order_repository;
import com.BumbleBee.app.repository.Product_repository;

@SpringBootApplication
public class BumbleBeeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BumbleBeeApplication.class, args);
	}

	@Autowired
	private Customer_repository customerRepository;
	private Order_repository orderRepository;
	private Product_repository productRepository;

	@Override
	public void run(String... args) throws Exception {
//		Customer customer1 = new Customer("venuja", 18, 12511, "Colombo");
//		customerRepository.save(customer1);
//
//		Customer customer2 = new Customer("ayesh", 18, 12511, "Colombo");
//		customerRepository.save(customer2);
//
//		// order data
//		Order order1 = new Order(01, 2500, 03, 1200);
//		orderRepository.save(order1);
//		Order order2 = new Order(02, 2500, 03, 1200);
//		orderRepository.save(order2);
//
//		// Product data
//		Product product1 = new Product("smart watch",7500,"watches","fdsfsdf");
//		productRepository.save(product1);
//		Product product2 = new Product("smart watch2",7500,"watches","fdsfsdf");
//		productRepository.save(product2);
	}

}
