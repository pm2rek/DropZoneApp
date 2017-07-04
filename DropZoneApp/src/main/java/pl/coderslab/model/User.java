package pl.coderslab.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	@Email(message="Podaj wlasciwy email")
	@Column(unique=true)
	private String email;
	
	@NotBlank(message="nie moge byc puste")
	private String password;
	
	private BigDecimal accountBalance;
	
	private int jumpsNumber;
	
	@OneToMany(mappedBy="user")
	private List<Parachute> parachutes;
	
	private Long insuranceNumber;
	
	private Date insuranceExpirationDate;
	
	@ManyToMany(mappedBy="users")
	private List<Flight> flights = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getJumpsNumber() {
		return jumpsNumber;
	}

	public void setJumpsNumber(int jumpsNumber) {
		this.jumpsNumber = jumpsNumber;
	}

	public List<Parachute> getParachutes() {
		return parachutes;
	}

	public void setParachutes(List<Parachute> parachutes) {
		this.parachutes = parachutes;
	}

	public Long getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(Long insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	public Date getInsuranceExpirationDate() {
		return insuranceExpirationDate;
	}

	public void setInsuranceExpirationDate(Date insuranceExpirationDate) {
		this.insuranceExpirationDate = insuranceExpirationDate;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
