package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.CartProduct;

public interface cartproduct extends JpaRepository<CartProduct, Integer> {

	void save(cartproduct cartproduct1);
}
