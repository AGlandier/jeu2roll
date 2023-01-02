package fr.jdr.entities;

import java.util.List;

import javax.persistence.GeneratedValue;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Race {
	
	@Id @GeneratedValue
	private Long id;
	
	private String nom;
	private float vitesse;
	private List<String> langues;
	private List<Long> sousraces;
	
	public Race(Long id, String nom, float vitesse) {
		this.id = id;
		this.nom = nom;
		this.vitesse = vitesse;
	}
	
	

}
