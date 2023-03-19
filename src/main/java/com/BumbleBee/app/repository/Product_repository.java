package com.BumbleBee.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.BumbleBee.app.entity.Product;
 
public interface Product_repository extends JpaRepository<Product, Long>{

}
