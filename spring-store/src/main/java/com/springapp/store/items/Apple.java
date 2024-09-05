package com.springapp.store.items;
import jakarta.persistence.Id;
import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Apple implements Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long productID;

	double price;

	int availability;

	String type;

	String shelf_life;


		public Apple(long productID, double price, int availability, String type, String shelf_life) {

		super();

		this.productID = productID;

		this.price = price;

		this.availability = availability;

		this.type = type;

		this.shelf_life = shelf_life;

	}
		public Apple(Map<String,Object> map) {
			

			//this.productID = (long) map.get("productID");

			this.price = (double) map.get("price");

			this.availability = (int) map.get("availability");

			this.type = (String) map.get("type");

			this.shelf_life = (String) map.get("shelf_life");

		}

		

		public Apple() {

			super();

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





		public int getAvailability() {

			return availability;

		}





		public void setAvailability(int availability) {

			this.availability = availability;

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

	
}














