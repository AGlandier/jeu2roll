package fr.jdr.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.jdr.entities.Race;
import fr.jdr.repository.RaceRepository;
import jakarta.websocket.server.PathParam;

@RestController @CrossOrigin("*")
public class RaceRest {
	
	@Autowired
	private RaceRepository rRepos;

	@GetMapping("race")
	public Iterable<Race> getAll () {
		return rRepos.findAll();
	}
	
	@GetMapping("race/nom/{nom}")
	public Optional<Race> getByNom (@PathVariable String nom) {
		if (rRepos.findByNom(nom).isPresent()) {
			return rRepos.findByNom(nom);
		}
		return null;
	}
}
