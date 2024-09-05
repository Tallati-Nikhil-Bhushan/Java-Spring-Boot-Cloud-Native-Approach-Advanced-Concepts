package com.security.demo.model;

public class Product {
	private long productID;
	private String description;
	private double price;
	public long getProductID() {
		return productID;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Product(long productID, String description, double price) {
		super();
		this.productID = productID;
		this.description = description;
		this.price = price;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
