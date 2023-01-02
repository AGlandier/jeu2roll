package fr.jdr.entities;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import fr.jdr.tools.caracsTools;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Fichedd {
	
	@Id @GeneratedValue
	private Long id;
	
	private boolean visible;
	private Date date;
	
	private String illu;
	
	private String nom_perso;
	private String race;
	private String classe;
	private int niveau;
	private String historique;
	private String alignement;
	private Long xp;
	
	private boolean inspiration;
	private int bonus_maitrise;
	
	private int force_;
	private int dexterite;
	private int constitution;
	private int intelligence;
	private int sagesse;
	private int charisme;
	private int perception;
	
	private int ca;
	private int initiative;
	private float vitesse;
	
	private int pvMax;
	private int pvActuels;
	private int des_vie;
	private boolean[] jds_mort;
	
	private String[] sauvegarde;
	private String[] competences;
	
	private String personnalite;
	private String ideaux;
	private String liens;
	private String defauts;
	
	private String capacites_traits;
	private String equipement;
	private String autres_maitrises_langues;
	
	private int age;
	private float taille;
	private float poids;
	private String yeux;
	private String peau;
	private String cheveux;
	
	private List<String> armes;
	private String armure;
	
	private String apparence;
	private String allies;
	private String histoire;
	private String capacites_supplementaires;
	private String tresor;
	
	@ManyToOne
	private User user;
	
	public void setCaracs () {
		
		List<Integer> des = new ArrayList<>();
		int result = 0;
		int percep = 0;
		int D6;
		
		// Force
		for (int i = 1; i <= 4; i++) {
			D6 = (int) Math.floor(Math.random()*6) + 1;
			des.add(D6);
		}
			Collections.sort(des);
			for (int i2 = 1; i2 <= 3; i2++) {
				result += des.get(i2);
			}
		this.setForce_(result);
		result = 0;
		des.clear();
		
		// Dexterite
		for (int i = 1; i <= 4; i++) {
			D6 = (int) Math.floor(Math.random()*6) + 1;
			des.add(D6);
		}
			Collections.sort(des);
			for (int i2 = 1; i2 <= 3; i2++) {
				result += des.get(i2);
			}
			this.setDexterite(result);
		result = 0;
		des.clear();
		
		// Constitution
		for (int i = 1; i <= 4; i++) {
			D6 = (int) Math.floor(Math.random()*6) + 1;
			des.add(D6);
		}
			Collections.sort(des);
			for (int i2 = 1; i2 <= 3; i2++) {
				result += des.get(i2);
			}
			this.setConstitution(result);
		result = 0;
		des.clear();
		
		// Intelligence
		for (int i = 1; i <= 4; i++) {
			D6 = (int) Math.floor(Math.random()*6) + 1;
			des.add(D6);
		}
			Collections.sort(des);
			for (int i2 = 1; i2 <= 3; i2++) {
				result += des.get(i2);
			}
		this.setIntelligence(result);
		result = 0;
		des.clear();
		
		// Sagesse + percep
		caracsTools tools = new caracsTools();
		for (int i = 1; i <= 4; i++) {
			D6 = (int) Math.floor(Math.random()*6) + 1;
			des.add(D6);
		}
			Collections.sort(des);
			for (int i2 = 1; i2 <= 3; i2++) {
				result += des.get(i2);
			}
		this.setSagesse(result);
		this.setPerception(10 + tools.modificateurCarac(result));
		result = 0;
		des.clear();
		
		// Charisme
		for (int i = 1; i <= 4; i++) {
			D6 = (int) Math.floor(Math.random()*6) + 1;
			des.add(D6);
		}
			Collections.sort(des);
			for (int i2 = 1; i2 <= 3; i2++) {
				result += des.get(i2);
			}
		this.setCharisme(result);
	}
}
