package com.example.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Department {
	@Id
private int deptId;
private String deptType;
private double offers;
private String giftcards;
@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
@JoinColumn(name="dept_id")
Set<Product>products;
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
public Department(int deptId, String deptType, double offers, String giftcards) {
	super();
	this.deptId = deptId;
	this.deptType = deptType;
	this.offers = offers;
	this.giftcards = giftcards;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
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
	return "Department [deptId=" + deptId + ", deptType=" + deptType + ", offers=" + offers + ", giftcards=" + giftcards
			+ "]";
}

}
