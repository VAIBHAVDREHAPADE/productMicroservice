package com.vthinkDynamics.productService.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vthinkDynamics.productService.model.Product;
import com.vthinkDynamics.productService.repos.ProductRepo;

@RestController
public class ProductRestController {
	@Autowired
	ProductRepo repo;
	
	@PostMapping("/addproduct")
	public Product Create(@RequestBody Product product)
	{
		return repo.save(product);
	}

}
