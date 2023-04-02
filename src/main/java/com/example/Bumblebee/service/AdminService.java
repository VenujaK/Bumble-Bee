package com.example.Bumblebee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Bumblebee.domain.Admin;
import com.example.Bumblebee.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository repo;
	  
	  public Admin login(String username, String password) {
	  Admin user = repo.findByUsernameAndPassword(username, password);
	   return user;
	  }

}
