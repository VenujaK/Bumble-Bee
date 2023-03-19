package com.BumbleBee.app.impl;

import com.BumbleBee.app.service.OrderService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BumbleBee.app.entity.Customer;
import com.BumbleBee.app.entity.Order;

import com.BumbleBee.app.repository.Order_repository;
import com.BumbleBee.app.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	private Order_repository orderRepository;

	public OrderServiceImpl(Order_repository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}

	@Override
	public List<Order> getAllOrder() {
		return orderRepository.findAll();
	}

	public Order saveOrder(Order order) {
		return orderRepository.save(order);
	}

}
