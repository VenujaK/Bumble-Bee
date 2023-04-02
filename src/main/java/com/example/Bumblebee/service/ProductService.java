package com.example.Bumblebee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Bumblebee.domain.Product;
import com.example.Bumblebee.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
    private ProductRepository repo;

	public List<Product> listAll() {
        return repo.findAll();
    }
    
    public void save(Product prd) {
        repo.save(prd);
    }
    
    public Product get(long pid) {
        return repo.findById(pid).get();
    }
    
    public void delete(long pid) {
        repo.deleteById(pid);
    }

}
