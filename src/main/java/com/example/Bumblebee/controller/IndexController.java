package com.example.Bumblebee.controller;

//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.example.Bumblebee.domain.Product;
//import com.example.Bumblebee.service.ProductService;

@Controller
public class IndexController {
	
//	@Autowired
//	private ProductService service;
	
	

//	 @RequestMapping(value="/index",method=RequestMethod.GET)
//	 public String index()
// {
//	 return "index";
// }
	 
// @RequestMapping(value ="/product" , method=RequestMethod.GET)
// public String viewHomePage(Model model)
// {
//	 List<Product> listproduct = service.listAll();
//	 model.addAttribute("listproduct", listproduct);
//		 System.out.print("Get /");
//		 return "product";
//	 }
 

 @RequestMapping(value = "/index",method=RequestMethod.GET)
 public String home() {
	 return "index";
 }
	
 
 @RequestMapping(value = "/contactus",method=RequestMethod.GET)
 public String contactus() {
	 return "contactus";
 }
 
 @RequestMapping(value = "/aboutus",method=RequestMethod.GET)
 public String aboutus() {
	 return "aboutus";
 }

}
