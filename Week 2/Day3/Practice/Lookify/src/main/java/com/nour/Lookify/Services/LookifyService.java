package com.nour.Lookify.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nour.Lookify.Model.Lookify;
import com.nour.Lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	@Autowired
	private LookifyRepository LookifyRepo;
	
	
	public List<Lookify> allLookifys(){
		return LookifyRepo.findAll();
	}
	
	public Lookify addLookify(Lookify Lookify) {
		return LookifyRepo.save(Lookify);
	}
	
	public List<Lookify> findByArtist(String artist) {
		return LookifyRepo.findByArtistContaining(artist);
	}
	
	public Lookify LookifyById(Long id) {
		Optional<Lookify> optionalLookify = LookifyRepo.findById(id);
		if(optionalLookify.isPresent()) {
			return optionalLookify.get();
		}
		return null;
	}
	
	public void deleteLookify(Lookify Lookify) {
		LookifyRepo.delete(Lookify);
	}
	//retrieve top 10 songs
	public List<Lookify> topTen()
	{
		return LookifyRepo.findFirst10ByOrderByRatingDesc();
	}
}
