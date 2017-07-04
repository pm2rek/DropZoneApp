package pl.coderslab.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Flight {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@CreationTimestamp
	private Date date;
	
	@ManyToOne
	private Aircraft aircraft;
	
	@ManyToMany
	private List<User> users = new ArrayList<>();
	
	private Date takeoff;
	
	private Date landing;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Aircraft getAircraft() {
		return aircraft;
	}

	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Date getTakeoff() {
		return takeoff;
	}

	public void setTakeoff(Date takeoff) {
		this.takeoff = takeoff;
	}

	public Date getLanding() {
		return landing;
	}

	public void setLanding(Date landing) {
		this.landing = landing;
	}
}
