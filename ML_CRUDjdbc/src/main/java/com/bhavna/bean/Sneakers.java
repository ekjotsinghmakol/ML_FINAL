package com.bhavna.bean;

public class Sneakers {
	private int id;
	private String shoeName;
	private double shoePrice;
	private String colour;

	public Sneakers(int id, String shoeName, double shoePrice, String colour) {
		super();
		this.id = id;
		this.shoeName = shoeName;
		this.shoePrice = shoePrice;
		this.colour = colour;
	}
	
	public Sneakers() {}
	

	public Sneakers(double shoePrice, int id) {
		super();
		this.id = id;
		this.shoePrice = shoePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShoeName() {
		return shoeName;
	}

	public void setShoeName(String shoeName) {
		this.shoeName = shoeName;
	}

	public double getShoePrice() {
		return shoePrice;
	}

	public void setShoePrice(double shoePrice) {
		this.shoePrice = shoePrice;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", shoeName=" + shoeName + ", shoePrice=" + shoePrice + ", colour=" + colour
				+ "]";
	}

}
