package com.bhavna.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sneakers")
public class Sneakers {

	@Id
	private int id;
	private String name;
	private int quantity;
	private int price;
	private String colour;
	
	public Sneakers() {}
	
	public Sneakers(int id, String name, int quantity, int price, String colour) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.colour = colour;
	}


	public int getShoe_Id() {
		return id;
	}


	public void setShoe_Id(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Sneakers [id=" + id + ", quantity=" + quantity + ", price=" + price + ", colour=" + colour + "]";
	}


	
	
	
	
	
	
}
