package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="TBL_PRODUCT")
@Entity
public class Product {
	@Id
private int id;
private double price;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Product [id=" + id + ", price=" + price + ", name=" + name + "]";
}




}
