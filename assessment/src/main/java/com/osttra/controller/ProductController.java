package com.osttra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osttra.entity.Product;
import com.osttra.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {

	
	@Autowired
	ProductRepository productRepository;
	
  @GetMapping("/{value}")
  public List<Product> ProductGreaterThanValue(@PathVariable Double value) {
	  
	return productRepository.findProductGreaterThanValue(value) ;
  
  }
  
  @GetMapping("/range/{value1}/{value2}")
  public List<Product> ProductPriceInBetween(@PathVariable Double value1,@PathVariable Double value2) {
	  
	return productRepository.findProductBetweenRange(value1, value2) ;
  
  }
  
  
  

	
	
	
	
	
	
}
