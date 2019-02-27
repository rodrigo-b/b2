package br.com.b2w.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.b2w.model.Planet;
import br.com.b2w.repository.PlanetRepository;

@RestController
@RequestMapping("/planets")
public class PlanetResource{

	@Autowired
	private PlanetRepository planetRepository;
	
	@PostMapping("/create")
	public ResponseEntity save(@RequestBody Planet planet) {
	
		planetRepository.save(planet);
		return null;
	}
}
