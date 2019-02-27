package br.com.b2w.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.b2w.model.Planet;
import br.com.b2w.repository.PlanetRepository;
import br.com.b2w.service.impl.PlanetServiceImpl;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import java.util.Optional;

@RunWith(SpringRunner.class)
public class PlanetServiceTest {

	private static final String NOME = "Rodrigo";
	
	@MockBean
	private PlanetRepository planetRepository;
	
	private PlanetService sut;
	
	private Planet planet;
	
	@Before
	public void setUp() throws Exception{
		sut = new PlanetServiceImpl(planetRepository);
		planet = new Planet(NOME);
	}
	
	@Test
	public void shouldFindPlanetById() throws Exception {
		
		
		Planet planet = new Planet("Alderaan");
		
		when(planetRepository.findById(1L)).thenReturn(Optional.of(planet));
        when(planetRepository.findByName("Alderaan")).thenReturn(Optional.empty());

		Planet planetTest = sut.findByName(planet);
		
		
		assertThat(planetTest).isNotNull();
		
		  verify(planetRepository).findById(1L);

	        assertThat(planetTest).isNotNull();
	        assertThat(planetTest.getName()).isEqualTo("Alderaan");
		
	}
	
}
