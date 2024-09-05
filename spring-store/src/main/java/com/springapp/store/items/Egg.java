package com.springapp.store.items;

import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Egg implements Item {



	public Egg(){}



	public Egg(long productID, double price, String type, String shelf_life, int availability) {

		super();

		this.price = price;

		this.type = type;

		this.shelf_life = shelf_life;

		this.availability = availability;

	}
	
	public Egg(Map<String,Object> map) {


		this.price = (double) map.get("price");

		this.type = (String) map.get("type");

		this.shelf_life = (String) map.get("shelf_life");

		this.availability = (int) map.get("availability");

	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long productID;

	double price;

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



	public double getPrice() {

		return price;

	}



	public void setPrice(double price) {

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
