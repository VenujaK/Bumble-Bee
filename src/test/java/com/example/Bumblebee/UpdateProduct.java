package com.example.Bumblebee;

import static org.junit.Assert.*;
import com.example.Bumblebee.controller.ProductController;
import com.example.Bumblebee.domain.Product;
import org.junit.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

public class UpdateProduct {

	@Test
	public void testShowEditProductPage() {
	    // Create a new instance of the ProductController class
	    ProductController controller = new ProductController();

	    // Call the showEditProductPage method with a valid pid value
	    long pid = 1L;
	    ModelAndView mav = controller.showEditProductPage(pid);

	    // Verify that the method returns a ModelAndView object with the expected view name and model attributes
	    assertEquals("new", mav.getViewName());
	    assertNotNull(mav.getModel());
	    assertTrue(mav.getModel().containsKey("product"));
	    assertEquals(Long.valueOf(pid), Long.valueOf(((Product)mav.getModel().get("product")).getPid()));
	}




}
