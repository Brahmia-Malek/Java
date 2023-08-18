package com.nour.Lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nour.Lookify.Model.Artist;


@Repository
public interface ArtistRepositories extends CrudRepository<Artist, Long> {
	List<Artist> findAll();

}
