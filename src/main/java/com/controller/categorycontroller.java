package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Category;
import com.repository.category;

@RestController
public class categorycontroller {
	
	@Autowired
category category;
	@PostMapping("/savecategory")
	
	public String savecategory(@RequestBody Category category1)
	{
	System.out.println(category1.getCategoryid());
	category.save(category1);
	return "category save";
	
}
	@GetMapping("/Category")
	public List<Category>categories(){
	List<Category>categoryList=category.findAll();
	return categoryList;
}


@DeleteMapping("/deletecategory/{id}")
public String deletecategory(@PathVariable int id)
{
	Optional<Category>category1=category.findById(id);
	if(category1.isPresent()) {
		category.delete(category1.get());
	}
	return "category deleted";
	
	
	
}
@PutMapping("/updatecategory/{id}")
public void updateCategoryData(@RequestBody Category category1)
{
	category.save(category1);
	
}
}
