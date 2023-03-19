package com.BumbleBee.app.impl;

import com.BumbleBee.app.service.ProductService;
import java.util.List;

import org.springframework.stereotype.Service;

import com.BumbleBee.app.entity.Customer;
import com.BumbleBee.app.entity.Product;
import com.BumbleBee.app.repository.Customer_repository;
import com.BumbleBee.app.repository.Product_repository;
import com.BumbleBee.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService  {
	private Product_repository productRepository ;
	
	public ProductServiceImpl(Product_repository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}
}

