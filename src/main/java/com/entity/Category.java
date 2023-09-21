package com.entity;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name="TBL_CATEGORY")
@Entity
public class Category {
	@Id
private int categoryid;
private String categoryname;
public int getCategoryid() {
	return categoryid;
}
public void setCategoryid(int categoryid) {
	this.categoryid = categoryid;
}
public String getCategoryname() {
	return categoryname;
}
public void setCategoryname(String categoryname) {
	this.categoryname = categoryname;
}
@Override
public String toString() {
	return "Category [categoryid=" + categoryid + ", categoryname=" + categoryname + "]";
}



}
