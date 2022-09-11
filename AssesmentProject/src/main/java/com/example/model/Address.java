package com.example.model;

import java.util.Set;

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
public class Address {

@Column(name = "store_id")	
private int storeId;
private String location;

@Id
private int pincode;
private String city;
private String state;

@OneToOne(fetch=FetchType.EAGER,cascade= CascadeType.ALL)
@JoinColumn(name="store_id",insertable = false, updatable =false)
private Walmart walmarts;


public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int storeId, String location, int pincode, String city, String state) {
	super();
	this.storeId = storeId;
	this.location = location;
	this.pincode = pincode;
	this.city = city;
	this.state = state;
}
public int getStoreId() {
	return storeId;
}
public void setStoreId(int storeId) {
	this.storeId = storeId;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}



public Walmart getWalmarts() {
	return walmarts;
}
public void setWalmarts(Walmart walmarts) {
	this.walmarts = walmarts;
}
@Override
public String toString() {
	return "Address [storeId=" + storeId + ", location=" + location + ", pincode=" + pincode + ", city=" + city
			+ ", state=" + state + "]";
}




}