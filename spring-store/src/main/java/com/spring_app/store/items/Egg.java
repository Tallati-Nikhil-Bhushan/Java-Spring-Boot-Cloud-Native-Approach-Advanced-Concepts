package com.spring_app.store.items;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Egg implements Item {



	Egg(){}



	public Egg(long productID, float price, String type, String shelf_life, int availability) {

		super();

		this.productID = productID;

		this.price = price;

		this.type = type;

		this.shelf_life = shelf_life;

		this.availability = availability;

	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long productID;

	float price;

	String type;

	String shelf_life;

	int availability;

	@Override

	public String toString() {

		return "Egg [productID=" + productID + ", price=" + price + ", type=" + type + ", shelf_life=" + shelf_life

				+ ", availability=" + availability + "]";

	}



	public long getProductID() {

		return productID;

	}



	public void setProductID(long productID) {

		this.productID = productID;

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



	public String getShelf_life() {

		return shelf_life;

	}



	public void setShelf_life(String shelf_life) {

		this.shelf_life = shelf_life;

	}



	public int getAvailability() {

		return availability;

	}



	public void setAvailability(int availability) {

		this.availability = availability;

	}	

	

	





}
