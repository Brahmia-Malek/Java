package com.malek.show.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="shows")
public class Show {
	// MEMBER VARIABLES
			@Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
			private Long id;
			
			@NotBlank
			@Size(min = 5, max = 15, message="you need a showname!!!!")
			private String showname;
			
			@NotBlank
			@Size(min = 5, max = 15, message="you need a network!!!!")
			private String network;
			
			@NotBlank
			@Size(min = 5, max = 225, message="you need a description!!!!")
			private String description;
		
		
			 @ManyToOne(fetch = FetchType.LAZY)
			 @JoinColumn(name="watcher_id")
			private User watcher;
			
			
			// This will not allow the createdAt column to be updated after creation
		    @Column(updatable=false)
		    @DateTimeFormat(pattern="yyyy-MM-dd")
			private Date createdAt;
			
		    @DateTimeFormat(pattern="yyyy-MM-dd")
			private Date updatedAt;
		    
		    

			// EMPTY CONSTRUCTOR
			public Show() {
			}



			public String getDescription() {
				return description;
			}



			public void setDescription(String description) {
				this.description = description;
			}



			public Long getId() {
				return id;
			}



			public void setId(Long id) {
				this.id = id;
			}



			public String getShowname() {
				return showname;
			}



			public void setShowname(String showname) {
				this.showname = showname;
			}



			public String getNetwork() {
				return network;
			}



			public void setNetwork(String network) {
				this.network = network;
			}



			public User getWatcher() {
				return watcher;
			}



			public void setWatcher(User watcher) {
				this.watcher = watcher;
			}



			public Date getCreatedAt() {
				return createdAt;
			}



			public void setCreatedAt(Date createdAt) {
				this.createdAt = createdAt;
			}



			public Date getUpdatedAt() {
				return updatedAt;
			}



			public void setUpdatedAt(Date updatedAt) {
				this.updatedAt = updatedAt;
			}
			
}
