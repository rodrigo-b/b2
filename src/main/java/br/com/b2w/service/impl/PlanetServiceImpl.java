package br.com.b2w.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.b2w.model.Planet;
import br.com.b2w.repository.PlanetRepository;
import br.com.b2w.service.PlanetService;

@Service
public class PlanetServiceImpl implements PlanetService{

	private final PlanetRepository planetRepository;
	
	public PlanetServiceImpl(PlanetRepository planetRepository){
		this.planetRepository = planetRepository;
	}
	
	@Override
	public Planet findById(Planet planet) throws Exception {

		final Optional<Planet> optional = planetRepository.findById(planet.getId());
	    return optional.orElseThrow(() -> new Exception("Alterar"));
	}

	@Override
	public Planet findByName(Planet planet) throws Exception {

		final Optional<Planet> optional = planetRepository.findByName(planet.getName());
		return optional.orElseThrow(() ->  new Exception("Alterar"));
	}

}
