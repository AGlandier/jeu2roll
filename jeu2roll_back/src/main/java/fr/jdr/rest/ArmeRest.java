package fr.jdr.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.jdr.entities.Arme;
import fr.jdr.repository.ArmeRepository;

@RestController @CrossOrigin("*")
public class ArmeRest {
	
	@Autowired
	private ArmeRepository aRepos;

	@PostMapping("arme")
	public void postArme (@RequestBody List<Arme> json) {
		Long i = (long) 0;
		for (Arme arme : json) {
			Arme a = arme;
			a.setId(i);
			aRepos.save(a);
			i++;
		}
	}
	
	@GetMapping("arme")
	public Iterable<Arme> getAll () {
		return aRepos.findAll();
	}
	
	@DeleteMapping("arme")
	public void deleteAll () {
		aRepos.deleteAll();
	}
}
