package com.bhavna.service;

import java.util.List;

import com.bhavna.entity.Sneakers;


public interface SneakerService {
	
	public List<Sneakers> getSneakers();
	
	public Sneakers getOrderbyId(int id);
	
	public Sneakers addOrder(Sneakers sneakers);
	
	public Sneakers updateOrder(Sneakers sneakers);
	
	public void deleteOrder(int id);

	
	
}
