package com.bhavna.bean;

public class Customer {
	private int id;
	private String name;
	private String location;
	private double balance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer(int id, String name, String location, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.balance = balance;
	}

	public Customer() {

	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", location=" + location + ", balance=" + balance + "]";
	}

}
