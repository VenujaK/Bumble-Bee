package com.example.Bumblebee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.Bumblebee.domain.Product;
import com.example.Bumblebee.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
    private ProductService service;
	
	@GetMapping("/manageproducts")
    public String viewHomePage(Model model) {
        List<Product> listproduct = service.listAll();
        model.addAttribute("listproduct", listproduct);
        System.out.print("Get / ");
        return "manageproducts";
    }
 
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("product", new Product());
        return "new";
    }
 
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("product") Product prd) {
        service.save(prd);
        return "redirect:/manageproducts";
    }
 
    @RequestMapping("/Update/{pid}")
    public ModelAndView showEditProductPage(@PathVariable(name = "pid") long pid) {
        ModelAndView mav = new ModelAndView("new");
        Product prd = service.get(pid);
        mav.addObject("product", prd);
        return mav;
        
    }
//    
//   @RequestMapping(value = "/Update/{pid}", method = RequestMethod.POST)
//    public String update(@PathVariable(name = "pid") long pid, @ModelAttribute("product") Product updatedProduct) {
//        Product existingProduct = service.get(pid);
//        existingProduct.setPname(updatedProduct.getPname());
//        existingProduct.setPdescription(updatedProduct.getPdescription());
//        existingProduct.setPprice(updatedProduct.getPprice());
//        existingProduct.setPcategory(updatedProduct.getPcategory());
//        existingProduct.setPbrand(updatedProduct.getPbrand());
//        service.save(existingProduct);
//        return "redirect:/manageproducts";
//    }

    @RequestMapping("/Delete/{pid}")
    public String delete(@PathVariable(name = "pid") long pid) {
        service.delete(pid);
        return "redirect:/manageproducts";
    }

}
