package br.com.b2w.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="planet")
public class Planet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String terrain;
	
	private String climate;
	
	@Column(name="times_in_movie")
	private Integer  timesInMovie;
	
	public Planet() {
	}

	public Planet(String name, String climate, String terrain) {

		this.name = name;
		this.climate = climate;
		this.terrain = terrain;
	
	}

	public Planet(long id) {
		this.id = id;
	}

	public Planet(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getTerrain() {
		return terrain;
	}

	public String getClimate() {
		return climate;
	}

	public Integer getTimesInMovie() {
		return timesInMovie;
	}
	
}
