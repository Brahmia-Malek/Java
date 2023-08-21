package com.malek.show.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malek.show.models.Show;
import com.malek.show.repositories.ShowRepository;

@Service
public class ShowService {
	// === CRUD ===
	
		@Autowired
		private ShowRepository showRepo;
		
		// READ ALL
		public List<Show> allShows(){
			return showRepo.findAll();
		}
		
		// CREATE
		public Show createShow(Show s) {
			return showRepo.save(s);
		}
		
		// READ ONE
		public Show findShow(Long id) {
			
			Optional<Show> maybeShow = showRepo.findById(id);
			if(maybeShow.isPresent()) {
				return maybeShow.get();
			}else {
				return null;
			}
		}
		
		// UPDATE 
		public Show updateShow(Show s) {
			return showRepo.save(s);
		}
		
		// DELETE
		public void deleteShow(Long id) {
			showRepo.deleteById(id);
		}
}
