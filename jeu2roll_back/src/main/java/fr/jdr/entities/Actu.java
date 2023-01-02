package fr.jdr.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Actu {
	
	@Id @GeneratedValue
	private Long id;
	private String titre;
	private String contenu;
	private String image;
	private Date date;
	
	@ManyToOne
	private User auteur;

}
