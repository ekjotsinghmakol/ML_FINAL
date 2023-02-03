package com.bhavna.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bhavna.entity.Sneakers;

@Repository
public interface SneakerDao extends CrudRepository<Sneakers, Integer> {

}
