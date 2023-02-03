package com.bhavna.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.bhavna.dao.SneakerDao;
import com.bhavna.entity.Sneakers;
import com.bhavna.exception.EmptyInputException;

@Service
public class SneakerServiceImpl implements SneakerService {

	@Autowired
	SneakerDao dao;

	@Override
	public Sneakers addOrder(Sneakers sneakers) {
		Sneakers sn1 = new Sneakers();
		if (sn1.getName().isEmpty() || sn1.getName().length() == 0) {
			throw new EmptyInputException("601", "Please send proper name, It's blank");
		}
		return dao.save(sneakers);
	}

	@Override
	public List<Sneakers> getSneakers() {
		List<Sneakers> shoelist = (List<Sneakers>) dao.findAll();
		if (shoelist.isEmpty()) {
			throw new NoSuchElementException("602");
		}
		return shoelist;

	}

	@Override
	public Sneakers getOrderbyId(int id) {
		Sneakers sneak2;
		sneak2 =dao.findById(id).get();
		if(ObjectUtils.isEmpty(sneak2)) {
			throw new NoSuchElementException("603");
		}
		return dao.findById(id).get();
	}

	@Override
	public Sneakers updateOrder(Sneakers sneakers) {
		
		return dao.save(sneakers);
	}

	@Override
	public void deleteOrder(int id) {

		dao.deleteById(id);

	}

}
