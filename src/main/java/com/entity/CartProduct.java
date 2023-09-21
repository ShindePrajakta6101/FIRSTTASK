package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="TBL_CARTPRODUCT")
@Entity

public class CartProduct {
	@Id
private int cartproductid;
private int quantity;
public int getCartproductid() {
	return cartproductid;
}
public void setCartproductid(int cartproductid) {
	this.cartproductid = cartproductid;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "CartProduct [cartproductid=" + cartproductid + ", quantity=" + quantity + "]";
}


}
