package com.malek.show.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.malek.show.models.Show;
@Repository
public interface ShowRepository extends CrudRepository<Show,Long> {
	// Read All
			List<Show> findAll();
}
