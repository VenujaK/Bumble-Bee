/**
 * 
 */
package com.example.Bumblebee;

import static org.junit.Assert.*;
import com.example.Bumblebee.controller.ProductController;
import com.example.Bumblebee.domain.Product;
import org.junit.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

/**
 * @author VenujaK
 *
 */
public class Addproduct {

	@Test
	
	public void testAdd() {
	    // Create a new instance of the ProductController class
	    ProductController controller = new ProductController();

	    // Create a new instance of the Model class
	    Model model = new ConcurrentModel();

	    // Call the add method
	    String viewName = controller.add(model);

	    // Verify that the add method returns the expected view name
	    assertEquals("new", viewName);

	    // Verify that the model contains the expected attributes
	    assertTrue(model.containsAttribute("product"));

	    Product product = (Product) model.getAttribute("product");
	    assertNotNull(product);
	}
	
	



}
