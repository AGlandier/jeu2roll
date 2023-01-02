package fr.jdr.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.jdr.entities.Armure;
import fr.jdr.repository.ArmureRepository;

@RestController @CrossOrigin("*")
public class ArmureRest {
	
	@Autowired
	private ArmureRepository aRepos;

	@PostMapping("armure")
	public void postArme (@RequestBody List<Armure> json) {
		Long i = (long) 0;
		for (Armure armure : json) {
			Armure a = armure;
			a.setId(i);
			aRepos.save(a);
			i++;
		}
	}
	
	@GetMapping("armure")
	public Iterable<Armure> getAll () {
		return aRepos.findAll();
	}
	
	@DeleteMapping("armure")
	public void deleteAll () {
		aRepos.deleteAll();
	}
}

