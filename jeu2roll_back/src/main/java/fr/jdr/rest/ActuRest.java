package fr.jdr.rest;

import java.sql.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.jdr.entities.Actu;
import fr.jdr.repository.ActuRepository;
import fr.jdr.tools.generalTools;

@RestController @CrossOrigin("*")
public class ActuRest {
	
	@Autowired
	private ActuRepository aRepos;
	
	@GetMapping("actu/all")
	public Iterable<Actu> getAll () {
		return aRepos.findAll();
	}
	
	@GetMapping("date")
	public Date getTodaysDate() {
		generalTools tool = new generalTools();
		return tool.GetTodayDate();
	}
	
	@PostMapping("actu")
	public void postActu(@RequestBody Actu actu) {
		actu.setDate(getTodaysDate());
		aRepos.save(actu);
	}
	
	@DeleteMapping("actu/{id}")
	public void deleteActu(@PathVariable Long id) {
		Optional<Actu> a = aRepos.findById(id);
		if (a.isPresent()) {
			aRepos.deleteById(id);
		}
	}

}
