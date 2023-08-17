package com.malek.review.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.malek.review.models.Car;
@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
	// Read All
		List<Car> findAll();
}
