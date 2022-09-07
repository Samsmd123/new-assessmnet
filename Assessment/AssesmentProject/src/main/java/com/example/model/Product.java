package com.example.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Product {
	
	private int productId;
	private String productName;
	private double price;
	private String brand;
	@ManyToMany
	Set<Department>departments;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, double price, String brand) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.brand = brand;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Set<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", brand="
				+ brand + "]";
	}

	
	
}
