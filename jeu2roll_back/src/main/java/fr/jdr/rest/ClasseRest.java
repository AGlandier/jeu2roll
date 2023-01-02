package fr.jdr.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.jdr.entities.Classe;
import fr.jdr.repository.ClasseRepository;

@RestController @CrossOrigin("*")
public class ClasseRest {
	
	@Autowired
	private ClasseRepository cRepos;

	@GetMapping("classe")
	public Iterable<Classe> getAll () {
		return cRepos.findAll();
	}
	
	@GetMapping("classe/nom/{nom}")
	public Optional<Classe> getByNom (@PathVariable String nom) {
		Optional<Classe> c = cRepos.findByNom(nom);
		if (c.isPresent()) {
			return c;
		}
		return null;
	}
		
}
