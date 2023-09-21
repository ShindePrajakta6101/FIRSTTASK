package com.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Product;
import com.repository.product;

import jakarta.persistence.Id;




@RestController

public class productcontroller {
	@Autowired
	product prod;
	
	@PostMapping("/saveproducts")
	
		public String saveproduct(@RequestBody Product product)
		{
		System.out.println(product.getId());
		prod.save(product);
		return "product save";
		
	}
	@GetMapping("/Products")
		public List<Product>products(){
		List<Product>productList=prod.findAll();
		return productList;
	}
	
	
	@DeleteMapping("/deleteproduct/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		Optional<Product>product=prod.findById(id);
		if(product.isPresent()) {
			prod.delete(product.get());
		}
		return "product deleted";
		
		
		
	}
	@PutMapping("/updateproduct/{id}")
	public void updateUserData(@RequestBody Product product)
	{
		prod.save(product);
		
	}
}
