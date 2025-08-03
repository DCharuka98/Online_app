package com.icbt.newt;

public class ProductNEW {
	
	private int productId;
	private String name;
	private String description;
	private double price;
	
	
	public ProductNEW(int productId, String name, String description, double price) {
		
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
	}


	public ProductNEW(int productId, String name, double price) {
		
		this.productId = productId;
		this.name = name;
		this.price = price;
	}


	public ProductNEW(int productId, double price) {
		
		this.productId = productId;
		this.price = price;
	}

	

	public ProductNEW() {
		
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	

}