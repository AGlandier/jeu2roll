package fr.jdr.entities;

import javax.persistence.GeneratedValue;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @ AllArgsConstructor @Data
public class Armure {

	@Id @GeneratedValue
	private Long id;
	
	private String nom;
	private String vo;
	private String ca;
	private String force_;
	private String discretion;
	private String poids;
	private String prix;
	
}
