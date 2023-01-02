package fr.jdr.tools;

import java.util.ArrayList;
import java.util.List;

import fr.jdr.entities.Classe;
import fr.jdr.entities.Competence;
import fr.jdr.entities.Race;
import fr.jdr.repository.ClasseRepository;
import fr.jdr.repository.CompetenceRepository;
import fr.jdr.repository.RaceRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Data_Classes {
	
	private ClasseRepository classeR;
	private RaceRepository raceR;
	private CompetenceRepository compR;
	
	public void creata_classes_data () {
		
		List<String> list = new ArrayList<>();
		list.add("Force"); list.add("Constitution");
		Classe barbare = new Classe("Barbare", 12, list);
		classeR.save(barbare);
		list.clear();
		list.add("Dextérité"); list.add("Charisme");
		Classe barde = new Classe("Barde", 8, list);
		classeR.save(barde);
		list.clear();
		list.add("Sagesse"); list.add("Charisme");
		Classe clerc = new Classe("Clerc", 8, list);
		classeR.save(clerc);
		list.clear();
		list.add("Sagesse"); list.add("Intelligence");
		Classe druide = new Classe("Druide", 8, list);
		classeR.save(druide);
		list.clear();
		list.add("Constitution"); list.add("Charisme");
		Classe ensorceleur = new Classe("Ensorceleur", 6, list);
		classeR.save(ensorceleur);
		list.clear();
		list.add("Force"); list.add("Constitution");
		Classe guerrier = new Classe("Guerrier", 10, list);
		classeR.save(guerrier);
		list.clear();
		list.add("Sagesse"); list.add("Intelligence");
		Classe magicien = new Classe("Magicien", 10, list);
		classeR.save(magicien);
		list.clear();
		list.add("Force"); list.add("Dextérité");
		Classe moine = new Classe("Moine", 8, list);
		classeR.save(moine);
		list.clear();
		list.add("Sagesse"); list.add("Charisme");
		Classe occultiste = new Classe("Occultiste", 8, list);
		classeR.save(occultiste);
		list.clear();
		list.add("Force"); list.add("Dextérité");
		Classe rodeur = new Classe("Rôdeur", 10, list);
		classeR.save(rodeur);
		list.clear();
		list.add("Intelligence"); list.add("Dextérité");
		Classe roublard = new Classe("Roublard", 10, list);
		classeR.save(roublard);
		list.clear();
		
		
	}
	
	public void dataRaces() {
		
		Race elfe = new Race(1l, "Elfe", 9f);
		raceR.save(elfe);
		Race halfelin = new Race(2l, "Halfelin", 7.5f);
		raceR.save(halfelin);
		Race humain = new Race(3l, "Humain", 9f);
		raceR.save(humain);
		Race nain = new Race(4l, "Nain", 7.5f);
		raceR.save(nain);
		Race demielfe = new Race(5l, "Demi-Elfe", 9f);
		raceR.save(demielfe);
		Race demiorc = new Race(6l, "Demi-Orc", 9f);
		raceR.save(demiorc);
		Race drakeide = new Race(7l, "Drakéide", 9f);
		raceR.save(drakeide);
		Race gnome = new Race(8l, "Gnome", 7.5f);
		raceR.save(gnome);
		Race tiefflin = new Race(9l, "Tiefflin", 9f);
		raceR.save(tiefflin);
	}
	
	public void dataCompetences() {
		Competence Acrobaties = new Competence(1l, "Acrobaties", "Dextérité");
		Competence Arcanes = new Competence(2l, "Arcanes", "Intelligence");
		Competence Athletisme = new Competence(3l, "Athletisme", "Force");
		Competence Discretion = new Competence(4l, "Discretion", "Dextérité");
		Competence Dressage = new Competence(5l, "Dressage", "Sagesse");
		Competence Escamotage = new Competence(6l, "Escamotage", "Dextérité");
		Competence Histoire = new Competence(7l, "Histoire", "Intelligence");
		Competence Intimidation = new Competence(8l, "Intimidation", "Charisme");
		Competence Intuition = new Competence(9l, "Intuition", "Sagesse");
		Competence Investigation = new Competence(10l, "Investigation", "Intelligence");
		Competence Medecine = new Competence(11l, "Medecine", "Sagesse");
		Competence Nature = new Competence(12l, "Nature", "Intelligence");
		Competence Perception = new Competence(13l, "Perception", "Sagesse");
		Competence Persuasion = new Competence(14l, "Persuasion", "Intelligence");
		Competence Religion = new Competence(15l, "Religion", "Sagesse");
		Competence Representation = new Competence(16l, "Representation", "Charisme");
		Competence Survie = new Competence(17l, "Survie", "Sagesse");
		Competence Tromperie = new Competence(18l, "Tromperie", "Charisme");
		
		compR.save(Acrobaties);
		compR.save(Arcanes);
		compR.save(Athletisme);
		compR.save(Discretion);
		compR.save(Dressage);
		compR.save(Escamotage);
		compR.save(Histoire);
		compR.save(Intimidation);
		compR.save(Intuition);
		compR.save(Investigation);
		compR.save(Medecine);
		compR.save(Nature);
		compR.save(Perception);
		compR.save(Persuasion);
		compR.save(Religion);
		compR.save(Representation);
		compR.save(Survie);
		compR.save(Tromperie);
	}

}
