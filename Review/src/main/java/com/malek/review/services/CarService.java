package com.malek.review.services;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malek.review.models.Car;
import com.malek.review.repositories.CarRepository;

@Service
public class CarService {
	// === CRUD ===
	
	@Autowired
	private CarRepository carRepo;
	
	// READ ALL
	public List<Car> allCars(){
		return carRepo.findAll();
	}
	
	// CREATE
	public Car createCar(Car c) {
		return carRepo.save(c);
	}
	
	// READ ONE
	public Car findCar(Long id) {
		
		Optional<Car> maybeCar = carRepo.findById(id);
		if(maybeCar.isPresent()) {
			return maybeCar.get();
		}else {
			return null;
		}
	}
	
	// UPDATE 
	public Car updateCar(Car c) {
		return carRepo.save(c);
	}
	
	// DELETE
	public void deleteCar(Long id) {
		carRepo.deleteById(id);
	}
	
}
