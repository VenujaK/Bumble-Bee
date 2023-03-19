package com.BumbleBee.app.service;

import java.util.List;

import com.BumbleBee.app.entity.Customer;
import com.BumbleBee.app.entity.Order;

public interface OrderService {
	List<Order> getAllOrder();
	static Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}
}
