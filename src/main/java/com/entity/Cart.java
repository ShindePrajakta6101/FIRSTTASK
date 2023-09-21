package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="TBL_CART")
@Entity
public class Cart {
	@Id
private int cartid;
private double totalamount;
public int getCartid() {
	return cartid;
}
public void setCartid(int cartid) {
	this.cartid = cartid;
}
public double getTotalamount() {
	return totalamount;
}
public void setTotalamount(double totalamount) {
	this.totalamount = totalamount;
}
@Override
public String toString() {
	return "Cart [cartid=" + cartid + ", totalamount=" + totalamount + "]";
}

}
