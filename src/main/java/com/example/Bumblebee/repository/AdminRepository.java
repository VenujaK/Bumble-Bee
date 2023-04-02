package com.example.Bumblebee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Bumblebee.domain.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{
	
	Admin findByUsernameAndPassword(String username, String password);

}
