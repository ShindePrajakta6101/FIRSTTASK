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

import com.entity.Cart;
import com.repository.cart;

@RestController
public class cartcontroller {
@Autowired
cart cart1;
@PostMapping("/savecarts")

public String savecart(@RequestBody Cart cart)
{
System.out.println(cart.getCartid());
cart1.save(cart);
return "cart save";

}
@GetMapping("/carts")
public List<Cart>carts(){
List<Cart>cartList=cart1.findAll();
return cartList;
}

@DeleteMapping("/deletecart/{id}")
public String deletecart(@PathVariable int id)
{
	Optional<Cart>cart=cart1.findById(id);
	if(cart.isPresent()) {
		cart1.delete(cart.get());
	}
	return "cart deleted";
	
}
@PutMapping("/updatecart/{id}")
public void updatecartData(@RequestBody Cart cart)
{
	cart1.save(cart);
	
}
}
