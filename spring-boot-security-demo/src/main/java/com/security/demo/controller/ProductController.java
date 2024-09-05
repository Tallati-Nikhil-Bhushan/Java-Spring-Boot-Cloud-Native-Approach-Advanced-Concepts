package com.security.demo.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.demo.model.Product;

@RestController
@RequestMapping("/product-api")
public class ProductController {

	List<Product> products = List.of(new Product(1,"tws buds",2000.0)
			,new Product(2,"kz edx pro",1000.0)
			,new Product(3,"kz edx pro 2",1500.0)
			,new Product(4,"oppo enco buds",2000.0));
	
	@GetMapping("/products")
	@PreAuthorize("hasRole('ADMIN')")
	public List<Product> getProducts(){
		return products;
	}
	
	@GetMapping("/guest")
	public String guestRoute() {
		return "well hello there";
	}
	
//	@GetMapping("product/{id}")
//	public Product getProductById(@PathVariable long id) {
//		return products.stream().filter(product -> product.getProductID()==id)id.;
//	}
}
