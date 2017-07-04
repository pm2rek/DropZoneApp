package pl.coderslab.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Aircraft {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String registration;
	
	@NotBlank
	private int maxPassengers;
	
	private List<Load> loads;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public List<Load> getLoads() {
		return loads;
	}

	public void setLoads(List<Load> loads) {
		this.loads = loads;
	}

	@Override
	public String toString() {
		return "AirCraft [id=" + id + ", name=" + name + ", registration=" + registration + "]";
	}
	
	
}
