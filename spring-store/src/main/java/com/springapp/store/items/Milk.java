package com.springapp.store.items;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Milk implements Item {





	public Milk() {

		// TODO Auto-generated constructor stub

	}



	public Milk(long productID, String brand, float price, String type, String expiry, int availability,

		float quantity) {

	super();

	this.productID = productID;

	this.brand = brand;

	this.price = price;

	this.type = type;

	this.expiry = expiry;

	this.availability = availability;

	this.quantity = quantity;

}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long productID;

	String brand;

	float price;

	String type;

	String expiry;

	int availability;

	//Milliliter

	float quantity;

	public long getProductID() {

		return productID;

	}



	public void setProductID(long productID) {

		this.productID = productID;

	}



	public String getBrand() {

		return brand;

	}



	public void setBrand(String brand) {

		this.brand = brand;

	}



	public float getPrice() {

		return price;

	}



	public void setPrice(float price) {

		this.price = price;

	}



	public String getType() {

		return type;

	}



	public void setType(String type) {

		this.type = type;

	}



	public String getExpiry() {

		return expiry;

	}



	public void setExpiry(String expiry) {

		this.expiry = expiry;

	}



	public int getAvailability() {

		return availability;

	}



	public void setAvailability(int availability) {

		this.availability = availability;

	}



	public float getQuantity() {

		return quantity;

	}



	public void setQuantity(float quantity) {

		this.quantity = quantity;

	}

	

	



}




