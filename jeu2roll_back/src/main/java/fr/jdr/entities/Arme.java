package fr.jdr.entities;

import javax.persistence.GeneratedValue;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Arme {
	
	@Id @GeneratedValue
	private Long id;
	
	private String nom;
	private String VO;
	private String Degats;
	private String Poids;
	private String Prix;
	private String Proprietes;

}
