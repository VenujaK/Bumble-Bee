package com.BumbleBee.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.BumbleBee.app.entity.Order;
import com.BumbleBee.app.entity.Customer;

public interface Customer_repository extends JpaRepository<Customer, Long>  {

}
