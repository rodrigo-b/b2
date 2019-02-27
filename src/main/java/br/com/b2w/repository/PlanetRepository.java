package br.com.b2w.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.b2w.model.Planet;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long>{

	Optional<Planet> findById(Long id);
	Optional<Planet> findByName(String name);
	
}
