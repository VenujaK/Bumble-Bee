package com.BumbleBee.app.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.BumbleBee.app.service.CustomerService;
import com.BumbleBee.app.entity.Customer;

@Controller
public class CustomerController {
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	// handle customer list
	@GetMapping("/Customers")
	public String listCustomer(Model model) {
	    model.addAttribute("Customer", customerService.getAllCustomer());
	    return "Customer";
	}

}
