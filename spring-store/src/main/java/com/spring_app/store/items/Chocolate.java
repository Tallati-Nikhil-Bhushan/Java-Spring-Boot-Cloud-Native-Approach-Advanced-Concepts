package com.spring_app.store.items;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Chocolate implements Item {

	public Chocolate() {

		// TODO Auto-generated constructor stub

	}

		public Chocolate(long productID, String brand, float price, String type, String expiry, int availability,

			String[] contents, String[] nutrition_info, int no_of_pieces, float weight) {

		super();

		this.productID = productID;

		this.brand = brand;

		this.price = price;

		this.type = type;

		this.expiry = expiry;

		this.availability = availability;

		this.contents = contents;

		this.nutrition_info = nutrition_info;

		this.no_of_pieces = no_of_pieces;

		this.weight = weight;

	}
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		long productID;

		String brand;

		float price;

		String type;

		String expiry;

		int availability;

		String[] contents;

		String[] nutrition_info;

		int no_of_pieces;

		float weight;

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

		public String[] getContents() {

			return contents;

		}

		public void setContents(String[] contents) {

			this.contents = contents;

		}

		public String[] getNutrition_info() {

			return nutrition_info;

		}

		public void setNutrition_info(String[] nutrition_info) {

			this.nutrition_info = nutrition_info;

		}

		public int getNo_of_pieces() {

			return no_of_pieces;

		}

		public void setNo_of_pieces(int no_of_pieces) {

			this.no_of_pieces = no_of_pieces;

		}

		public float getWeight() {

			return weight;

		}

		public void setWeight(float weight) {

			this.weight = weight;

		}

		
}



