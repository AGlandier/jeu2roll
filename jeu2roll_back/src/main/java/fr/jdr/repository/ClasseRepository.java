package fr.jdr.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.jdr.entities.Classe;

public interface ClasseRepository extends CrudRepository<Classe, Long>{
	
	public Optional<Classe> findByNom (String nom);

}
