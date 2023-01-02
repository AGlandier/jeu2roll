package fr.jdr.entities;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class User {
	
	@Id @GeneratedValue
	private Long id;
	private boolean admin;
	@Column(unique = true)
	private String login;
	private String mdp;
	private String email;
	private Date naissance;
	private String photo;

}
