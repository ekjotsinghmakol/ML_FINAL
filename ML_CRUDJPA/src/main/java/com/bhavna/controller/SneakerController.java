package com.bhavna.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.entity.Sneakers;
import com.bhavna.exception.EmptyInputException;
import com.bhavna.service.SneakerService;

@RestController
public class SneakerController {

	@Autowired
	SneakerService sneak;

	@RequestMapping("/")
	public String display() {
		System.out.println("hellos");
		return "Welcome to Sneaker hub";
	}

	@GetMapping("/get")
	public List<Sneakers> getSneakers() {
		return this.sneak.getSneakers();
	}

	@GetMapping("/getbyid/{id}")
	public Sneakers getOrderbyId(@PathVariable int id) {
		return this.sneak.getOrderbyId(id);
	}

	@PostMapping("/add")
	public Sneakers addOrder(@RequestBody Sneakers sneakers) {

		return this.sneak.addOrder(sneakers);
	}

	@PutMapping("/update")
	public Sneakers updateOrder(@RequestBody Sneakers sneakers) {
		return this.sneak.updateOrder(sneakers);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable int id) {
		try {
			this.sneak.deleteOrder(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
