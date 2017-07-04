package pl.coderslab.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	private BigDecimal accountBalance;
	
	private int jumpsNumber;
	
	private Parachute parachute;
	
	private Long insuranceNumber;
	
	private Date insuranceExpirationDate;
	
	private List<Load> loads;

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

	public Parachute getParachute() {
		return parachute;
	}

	public void setParachute(Parachute parachute) {
		this.parachute = parachute;
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

	public List<Load> getLoads() {
		return loads;
	}

	public void setLoads(List<Load> loads) {
		this.loads = loads;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
