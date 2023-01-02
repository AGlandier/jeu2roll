package fr.jdr.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.jdr.entities.Competence;
import fr.jdr.repository.CompetenceRepository;

@RestController @CrossOrigin("*")
public class CompetenceRest {
	
	@Autowired
	private CompetenceRepository cRepos;

	@GetMapping("competence")
	public Iterable<Competence> getAll () {
		return cRepos.findAll();
	}
}
