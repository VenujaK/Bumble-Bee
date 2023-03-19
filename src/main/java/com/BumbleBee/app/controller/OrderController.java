package com.BumbleBee.app.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.BumbleBee.app.entity.Customer;
import com.BumbleBee.app.entity.Order;
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
		@GetMapping("/Orders/new")
		public String createOrderForm(Model model) {
			Order order = new Order();
			model.addAttribute("order",order);
			return "create_order";
		
		}
		@PostMapping("/Orders")
		public String saveOrder(@ModelAttribute("order") Order order) {
			OrderService.saveOrder(order);
			return "redirect:/Order";
		}
}
