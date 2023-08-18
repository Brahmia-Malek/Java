package com.nour.Lookify.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="artists")
public class Artist {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String name_artist;
	
	@OneToMany(mappedBy="artist",fetch=FetchType.LAZY)
	 private List<Lookify> lookify;
	
	

	public List<Lookify> getLookify() {
		return lookify;
	}

	public void setLookify(List<Lookify> lookify) {
		this.lookify = lookify;
	}

	public Artist() {}
	
	public Long getId() {
		return id;
	}
	

	public void setId(Long id) {
		this.id = id;
	}

	public String getName_artist() {
		return name_artist;
	}

	public void setName_artist(String name_artist) {
		this.name_artist = name_artist;
	}
	
}
