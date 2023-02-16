package fr.jdr.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.jdr.entities.Amitie;
import fr.jdr.entities.User;

public interface AmitieRepository extends CrudRepository<Amitie, Long>{

	public Iterable<Amitie> findAllByUser1 (User u);
	public Iterable<Amitie> findAllByUser1AndAccepte (User u, boolean b);
	public Optional<Amitie> findByUser1AndUser2 (User u1, User u2);
}
