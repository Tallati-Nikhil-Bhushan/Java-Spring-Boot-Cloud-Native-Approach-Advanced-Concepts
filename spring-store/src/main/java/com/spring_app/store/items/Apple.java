package com.spring_app.store.items;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Apple implements Item {

		public Apple(long productID, float price, int availability, String type, String shelf_life) {

		super();

		this.productID = productID;

		this.price = price;

		this.availability = availability;

		this.type = type;

		this.shelf_life = shelf_life;

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





		public float getPrice() {

			return price;

		}





		public void setPrice(float price) {

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




		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		long productID;

		float price;

		int availability;

		String type;

		String shelf_life;

	
}














