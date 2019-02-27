package br.com.b2w.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.b2w.model.Planet;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;




@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value = "/load-database.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
@Sql(value = "/clean-database.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
@DataJpaTest
@TestPropertySource("classpath:application.properties")
public class PlanetRepositoryTest {

	@Autowired
	private PlanetRepository sut;
	
//	@Test	
//	public void shouldFindPlanetById(){
//		
//		Optional<Planet> optional = sut.findById(1L);
//		assertThat(optional.isPresent()).isTrue();
//		
//		Planet planet = optional.get();
//		
//		assertThat(planet.getName()).isEqualTo("teste");
//		assertThat(planet.getClimate()).isEqualTo("temperate");
//		assertThat(planet.getTerrain()).isEqualTo("grasslands, mountains");
//		assertThat(planet.getTimesInMovie()).isEqualTo(2);
//	}
	
//	@Test 
//	public void shouldNotFindPlanetById(){
//		Optional<Planet> optional = sut.findById(9999999L);
//		assertThat(optional.isPresent()).isFalse();
//	}
//	
	@Test
	public void shouldFindPlanetByName(){
		
		Optional<Planet> optional = sut.findByName("Alderaan");
		assertThat(optional.isPresent()).isTrue();
		
		Planet planet = optional.get();
		assertThat(planet.getClimate()).isEqualTo("temperate");
		assertThat(planet.getTerrain()).isEqualTo("grasslands, mountains");
		assertThat(planet.getTimesInMovie()).isEqualTo(2);
		assertThat(planet.getId()).isEqualTo(1L);
	}
//	
//	@Test
//	public void shouldNotFindPlanetByName(){
//		
//		Optional<Planet> optional = sut.findByName("marte");
//		assertThat(optional.isPresent()).isFalse();
//		
//	}
	
	
}
