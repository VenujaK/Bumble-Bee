package com.example.Bumblebee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Bumblebee.domain.Customer;
import com.example.Bumblebee.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
    private CustomerService service;
	
	@GetMapping("/CustomerView")
    public String viewCustomerPage(Model model) {
        List<Customer> listcustomer = service.listAllCus();
        model.addAttribute("listcustomer", listcustomer);
        System.out.print("Get / ");
        return "CustomerView";
    }
	
	@GetMapping("/customerregistering")
    public String add(Model model) {
        model.addAttribute("customer", new Customer());
        return "customerregistering";
    }
	
//	@GetMapping("/CustomerView")
//    public String add2(Model model) {
//        model.addAttribute("customer", new Customer());
//        return "CustomerView";
//    }
	
//	@GetMapping("/customerregistering")
//    public String add(Model model) {
//    List<Customer> listcustomer = service.listAll();
//        model.addAttribute("listcustomer", listcustomer);
//	        model.addAttribute("customer", new Customer());
//        return "customerregistering";
//    }
 
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String saveCustomers(@ModelAttribute("customer") Customer cust) {
        service.saveAllCus(cust);
        return "redirect:/index";
    }
   
	
//	@GetMapping("/customer")
//    
//    public ModelAndView customer() {
//     ModelAndView mav = new ModelAndView("customer");
//        mav.addObject("user", new Customer());
//        return mav;
//    }
// 
//    @PostMapping("/customer")
//    public String login(@ModelAttribute("cus") Customer cus ) {
//    
//     Customer registration = service.login(cus.getUsername(), cus.getPassword());
//    
// 
//     System.out.print(registration);
//     if(Objects.nonNull(registration))
//     {
//  
//     return "redirect:/";
//    
//    
//     } else {
//     return "redirect:/login";
//    
//    
//     }
}
