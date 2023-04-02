package com.example.Bumblebee.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.Bumblebee.domain.Admin;
import com.example.Bumblebee.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
    private AdminService userService;
 
                                  
    @GetMapping("/adminsignin")
          
    public ModelAndView login() {
     ModelAndView mav = new ModelAndView("adminsignin");
        mav.addObject("user", new Admin());
        return mav;
    }
 
    @PostMapping("/adminsignin")
    public String login(@ModelAttribute("user") Admin user ) {
    
     Admin oauthUser = userService.login(user.getUsername(), user.getPassword());
    
 
     System.out.print(oauthUser);
     if(Objects.nonNull(oauthUser))
     {
  
     return "redirect:/manageproducts";
    
    
     } else {
     return "redirect:/index";
    
    
     }
 
}
    
    
}
