package com.example.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Department {
private String deptType;
private double offers;
private String giftcards;
@ManyToMany
Set<Product>products;
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
public Department(String deptType, double offers, String giftcards) {
	super();
	this.deptType = deptType;
	this.offers = offers;
	this.giftcards = giftcards;
}
public String getDeptType() {
	return deptType;
}
public void setDeptType(String deptType) {
	this.deptType = deptType;
}
public double getOffers() {
	return offers;
}
public void setOffers(double offers) {
	this.offers = offers;
}
public String getGiftcards() {
	return giftcards;
}
public void setGiftcards(String giftcards) {
	this.giftcards = giftcards;
}
public Set<Product> getProducts() {
	return products;
}
public void setProducts(Set<Product> products) {
	this.products = products;
}
@Override
public String toString() {
	return "Department [deptType=" + deptType + ", offers=" + offers + ", giftcards=" + giftcards + "]";
}


}
