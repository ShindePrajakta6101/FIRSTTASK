package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Product;
import com.repository.product;




@RestController
public class controller {

	

	@Autowired
	product p;
	
	@PostMapping("/savePRODUCT")
	
		public String saveproduct(@RequestBody Product p1)
		{
		System.out.println(p1.getId());
		p.save(p1);
		return "data save";
		
	}
	@GetMapping("/getdata")
	public Product getproduct(@RequestParam int id)
	{
		Optional<Product>pp=p.findById(id);
		Product p1=pp.get();
		return p1;
		
	}
	
	@GetMapping("/getalldata")
	public List<Product> getallproduct()
	{
		List<Product>p1=p.findAll();
		return p1;
	}
	@DeleteMapping("/deleteProduct")
	public String deleteproduct(@RequestParam int id)
	{
		p.deleteById(id);
		return "delete sucessfully";
		
		
	}
	
}
