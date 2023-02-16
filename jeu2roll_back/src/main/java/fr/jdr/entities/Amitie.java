package fr.jdr.entities;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @AllArgsConstructor @NoArgsConstructor @Data
public class Amitie {
	
	@Id @GeneratedValue
	private Long Id;
	private boolean accepte;
	@OneToOne
	private User user1;
	@OneToOne
	private User user2;
}
