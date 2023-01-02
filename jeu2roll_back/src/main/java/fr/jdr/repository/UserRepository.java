package fr.jdr.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.jdr.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{
	public Optional<User> findByLogin (String log);
}
