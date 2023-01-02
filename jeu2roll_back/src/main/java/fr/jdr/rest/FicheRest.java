package fr.jdr.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.jdr.entities.Fichedd;
import fr.jdr.entities.User;
import fr.jdr.repository.FicheRepository;
import fr.jdr.tools.caracsTools;

@RestController @CrossOrigin("*")
public class FicheRest {
	@Autowired
	private FicheRepository fRepos;
	
	caracsTools tools = new caracsTools();

	@GetMapping("/fiche/all/{user}")
	public Iterable<Fichedd> getAllByUser (@PathVariable User user) {
		return fRepos.findAllByUser(user);
	}
	
	@GetMapping("/fiche/all/visible")
	private Iterable<Fichedd> getAllVisible () {
		return fRepos.findAllByVisible(true);
	}
	
	@PatchMapping("/fiche/basecarac/{id}")
	public boolean tireCaracs (@PathVariable Long id) {
		
		Optional<Fichedd> fiche = fRepos.findById(id);
		
		if (fiche.isPresent()) {
			Fichedd f = fiche.get();
			
			f.setCaracs();
			
			fRepos.save(f);
			
			return true;
		}
		
		return false;
	}
	
	@GetMapping("/roll/caracs")
	public List<Integer> rollCaracs () {
		return tools.getListCarac();
	}
	
	@GetMapping("/roll/life/{dice}/{number}/{constit}/{mean}")
	public int rollLife (@PathVariable int dice, @PathVariable int number, @PathVariable int constit, @PathVariable boolean mean) {
		if (mean) {
			return (number*(dice/2 + 1) + tools.modificateurCarac(constit));
		}
		return tools.rollLife(dice, number, constit);
	}
}
