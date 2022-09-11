package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Walmart {
private String branchName;
@Id
@Column(name = "id")
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;


@Column(name = "store_id")
private int storeId;

@OneToOne(fetch=FetchType.EAGER,cascade= CascadeType.ALL)
@JoinColumn(name="store_id",insertable = false, updatable =false)
private Address address;

public Walmart() {
	super();
	// TODO Auto-generated constructor stub
}

public Walmart(String branchName, int storeId) {
	super();
	this.branchName = branchName;
	this.storeId = storeId;
}

public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public int getstoreId() {
	return storeId;
}
public void setstoreId(int storeId) {
	this.storeId = storeId;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Walmart [branchName=" + branchName + ", storeId=" + storeId + "]";
}





}
