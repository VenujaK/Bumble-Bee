package com.BumbleBee.app.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.BumbleBee.app.service.CustomerService;
import com.BumbleBee.app.service.OrderService;

@Controller
public class OrderController {
	private OrderService orderService;
	
	
	public OrderController(OrderService orderService) {
		super();
		this.orderService = orderService;
	}


	// handle Order list
		@GetMapping("/Orders")
		public String listOrder(Model model) {
		    model.addAttribute("Order", orderService.getAllOrder());
		    return "Order";
		}

}
