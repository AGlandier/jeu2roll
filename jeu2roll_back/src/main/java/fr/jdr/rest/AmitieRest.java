package fr.jdr.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.jdr.entities.Amitie;
import fr.jdr.entities.User;
import fr.jdr.repository.AmitieRepository;
import fr.jdr.repository.UserRepository;

@RestController @CrossOrigin("*")
public class AmitieRest {
	
	@Autowired
	private AmitieRepository aRepos;
	@Autowired
	private UserRepository uRepos;
	
	@GetMapping("friend/{id}")
	public Iterable<Amitie> getAllByUser (@PathVariable Long id) {
		Optional<User> u = uRepos.findById(id);
		
		if (u.isPresent()) {
			return aRepos.findAllByUser1(u.get());
		}
		return null;
	}
	
	@GetMapping("friend/accept/{id}")
	public Iterable<Amitie> getAllByUserAndAccept (@PathVariable Long id) {
		Optional<User> u = uRepos.findById(id);
		
		if (u.isPresent()) {
			return aRepos.findAllByUser1AndAccepte(u.get(), true);
		}
		return null;
	}
	
	@GetMapping("friend/pending/{id}")
	public Iterable<Amitie> getAllByUserPending (@PathVariable Long id) {
		Optional<User> u = uRepos.findById(id);
		
		if (u.isPresent()) {
			return aRepos.findAllByUser1AndAccepte(u.get(), false);
		}
		return null;
	}


	@PostMapping("friend")
	public boolean createFriendship (@RequestBody Amitie friend) {
		
		Optional<Amitie> oa1 = aRepos.findByUser1AndUser2(friend.getUser1(), friend.getUser2());
		Optional<Amitie> oa2 = aRepos.findByUser1AndUser2(friend.getUser2(), friend.getUser1());
		
		if (oa1.isEmpty() || oa2.isEmpty()) {
			friend.setAccepte(false);
			aRepos.save(friend);
			return true;
		}
		return false;
	}
	
	@PatchMapping("friend/accept/{id}")
	public boolean acceptFriend (@PathVariable Long id) {
		Optional<Amitie> a = aRepos.findById(id);
		if (a.isPresent()) {
			Amitie aa = a.get();
			aa.setAccepte(true);
			aRepos.save(aa);
			return true;
		}
		return false;
	}
	
	@DeleteMapping("friend/reject/{id}")
	public boolean rejectFriend (@PathVariable Long id) {
		Optional<Amitie> a = aRepos.findById(id);
		if (a.isPresent()) {
			aRepos.deleteById(id);
			return true;
		}
		return false;
	}
}
