package br.com.b2w.service;

import br.com.b2w.model.Planet;

public interface PlanetService {

	Planet findById(Planet planet) throws Exception;
	Planet findByName(Planet planet) throws Exception;
	
}
