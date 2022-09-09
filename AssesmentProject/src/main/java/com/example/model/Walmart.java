package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Walmart {
private String branchName;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@OneToOne
private Address address;
public Walmart() {
	super();
	// TODO Auto-generated constructor stub
}
public Walmart(String branchName, int id) {
	super();
	this.branchName = branchName;
	this.id = id;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Walmart [branchName=" + branchName + ", id=" + id + "]";
}




}
