package com.example.Bumblebee;

import static org.junit.Assert.*;
import com.example.Bumblebee.controller.ProductController;
import com.example.Bumblebee.domain.Product;
import org.junit.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

public class Deleteproduct {

	@Test
	public void test() {
		
		    // Create a new instance of the ProductController class
		    ProductController controller = new ProductController();

		    // Call the delete method with a valid pid value
		    String viewName = controller.delete(1L);

		    // Verify that the method redirects to the expected URL
		    assertEquals("redirect:/manageproducts", viewName);
		
	}

}
