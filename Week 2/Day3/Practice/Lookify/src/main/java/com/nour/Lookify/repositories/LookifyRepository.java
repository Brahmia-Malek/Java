package com.nour.Lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nour.Lookify.Model.Lookify;
@Repository
public interface LookifyRepository extends CrudRepository<Lookify, Long>{
	public List<Lookify> findAll();
	
	
	public List<Lookify> findByArtistContaining(String artist);
	List<Lookify> findAllByOrderByRatingDesc();
	List<Lookify> findFirst10ByOrderByRatingDesc();

}
