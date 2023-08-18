package com.malek.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malek.savetravels.models.Travel;
import com.malek.savetravels.repositories.TravelRepository;

@Service
public class TravelService {
	// === CRUD ===

				@Autowired
				private TravelRepository TravelRepository;

				// READ ALL
				public List<Travel> allTravels(){
					return TravelRepository.findAll();
				}

				// CREATE
				public Travel createTravel(Travel t) {
					return TravelRepository.save(t);
				}

				// READ ONE
				public Travel findTravel(Long id) {

					Optional<Travel> maybeTravel = TravelRepository.findById(id);
					if(maybeTravel.isPresent()) {
						return maybeTravel.get();
					}else {
						return null;
					}
				}

				// UPDATE 
				public Travel updateTravel(Travel t) {
					return TravelRepository.save(t);
				}

				// DELETE
				public void deleteTravel(Long id) {
					TravelRepository.deleteById(id);
				}
}
