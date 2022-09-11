package com.example.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Product {
	@Id
	private int productId;
	private int deptId;
	private String productName;
	private double price;
	private String brand;
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="dept_id")
	Set<Department> departments;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, int deptId, String productName, double price, String brand) {
		super();
		this.productId = productId;
		this.deptId = deptId;
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
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
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
		return "Product [productId=" + productId + ", deptId=" + deptId + ", productName=" + productName + ", price="
				+ price + ", brand=" + brand + "]";
	}
	
	
}