package com.BumbleBee.app.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.BumbleBee.app.service.OrderService;
import com.BumbleBee.app.service.ProductService;

@Controller
public class ProductController {
	private ProductService productService;

	
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}


	// handle Product list
	@GetMapping("/Products")
	public String listProduct(Model model) {
	    model.addAttribute("Product", productService.getAllProduct());
	    return "Product";
	}
	

}
