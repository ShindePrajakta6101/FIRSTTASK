package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Cart;

public interface cart extends JpaRepository<Cart, Integer> {
	void save(cart cart1);
}
