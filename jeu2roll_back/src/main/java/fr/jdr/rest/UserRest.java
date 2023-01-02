package fr.jdr.rest;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.jdr.entities.User;
import fr.jdr.repository.UserRepository;
@RestController @CrossOrigin("*")
public class UserRest {
	
	@Autowired
	private UserRepository uRepos;

	@GetMapping("/user")
	public Iterable<User> getAllUsers () {
		return uRepos.findAll();
	}
	
	@PostMapping("/user/login")
	public User userConnection (@RequestBody User user) {
		Optional<User> u = uRepos.findByLogin(user.getLogin());
		
		if (u.isPresent()) {
			if (u.get().getMdp().equals(user.getMdp())) {
				User u2 = u.get();
				u2.setMdp(null);
				return u2;
			}
		}
		return null;
	}
	
	@PostMapping("/user/register")
	public boolean userInscription (@RequestBody User user) {
		Optional<User> u = uRepos.findByLogin(user.getLogin());
		
		if (u.isPresent()) {
			return false;
		}
		uRepos.save(user);
		return true;
	}
	
	@PostMapping("/user/photo/{id}")
	public boolean setPhoto (@RequestBody User user, @PathVariable Long id) {
		Optional<User> u = uRepos.findById(id);
		if (u.isPresent()) {
			u.get().setPhoto(user.getPhoto());
			uRepos.save(u.get());
			return true;
		}
		return false;
	}

}
