package fr.jdr.entities;

import javax.persistence.GeneratedValue;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Competence {
	
	@Id @GeneratedValue
	private Long id;
	
	private String nom;
	private String caracteristique;
}
