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

import com.entity.CartProduct;
import com.repository.cartproduct;

@RestController
public class cartproductcontroller {

	@Autowired
	
	cartproduct cartProduct;
	@PostMapping("/savecartproducts")
	
	public String savecartproduct(@RequestBody CartProduct cartproduct1)
	{
	System.out.println(cartproduct1.getCartproductid());
	cartProduct.save(cartproduct1);
	return "cartmproduct save";
	
}
	@GetMapping("/cartProducts")
	public List<CartProduct>cartproducts(){
	List<CartProduct>cartList=cartProduct.findAll();
	return cartList;
}


@DeleteMapping("/deletecartproduct/{id}")
public String deletecartProduct(@PathVariable int id)
{
	Optional<CartProduct>cartproduct=cartProduct.findById(id);
	if(cartproduct.isPresent()) {
		cartProduct.delete(cartproduct.get());
	}
	return "cartproduct deleted";
	
	
	
}
@PutMapping("/updatecartproduct/{id}")
public void updateCartproductData(@RequestBody CartProduct cartproduct)
{
	cartProduct.save(cartproduct);
	
}
	
}