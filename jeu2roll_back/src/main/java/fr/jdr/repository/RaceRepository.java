package fr.jdr.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.jdr.entities.Race;

public interface RaceRepository extends CrudRepository<Race, Long>{
	
	public Optional<Race> findByNom (String nom);

}
