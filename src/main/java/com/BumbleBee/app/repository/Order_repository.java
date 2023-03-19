package com.BumbleBee.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.BumbleBee.app.entity.Order;
public interface Order_repository extends JpaRepository<Order, Long> {

}
