package fr.jdr.repository;

import org.springframework.data.repository.CrudRepository;

import fr.jdr.entities.Fichedd;
import fr.jdr.entities.User;

public interface FicheRepository extends CrudRepository<Fichedd, Long>{

	public Iterable<Fichedd> findAllByUser (User user);
	public Iterable<Fichedd> findAllByVisible (boolean pub);
}
