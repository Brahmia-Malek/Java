package com.nour.Lookify.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nour.Lookify.Model.Artist;
import com.nour.Lookify.repositories.ArtistRepositories;

@Service
public class ArtistServices {
	@Autowired
	private ArtistRepositories ArtistRepo;
	
	//get all
	public List<Artist> allArt(){
		return ArtistRepo.findAll();
	}
	//create
	public Artist create(Artist artist) {
		return ArtistRepo.save(artist);
	}
}
