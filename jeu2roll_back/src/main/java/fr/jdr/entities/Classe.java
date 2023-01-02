package fr.jdr.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Classe {
	
	@Id @GeneratedValue
	private Long id;
	
	private String nom;
	private int de_vie;
	private String[] armures;
	private String[] armes;
	private String[] outils;
	private List<String> jds;
	private String[] competences;
	private String[] competences_classe;
	private String[] voie;
	
	public Classe(String nom, int de_vie, List<String> jds) {
		this.nom = nom;
		this.de_vie = de_vie;
		this.jds = jds;
	}
	


	
}
