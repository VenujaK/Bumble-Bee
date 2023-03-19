package com.BumbleBee.app.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.BumbleBee.app.entity.Customer;
import com.BumbleBee.app.entity.Product;
import com.BumbleBee.app.service.CustomerService;
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
	@GetMapping("/Products/new")
	public String createProductForm(Model model) {
		Product product = new Product();
		model.addAttribute("product",product);
		return "create_product";
	}
	@PostMapping("/Products")
	public String saveProducts(@ModelAttribute("products") Product products) {
		ProductService.saveProducts(products);
		return "redirect:/Products";
	}
	

}
