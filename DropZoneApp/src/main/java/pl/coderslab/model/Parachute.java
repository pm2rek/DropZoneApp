package pl.coderslab.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parachute {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String mainParachuteName;
	
	private String reserveParachuteName;
	
	private String ADDName;
	
	private Date expirationDate;
	
	private String type;
	
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMainParachuteName() {
		return mainParachuteName;
	}

	public void setMainParachuteName(String mainParachuteName) {
		this.mainParachuteName = mainParachuteName;
	}

	public String getReserveParachuteName() {
		return reserveParachuteName;
	}

	public void setReserveParachuteName(String reserveParachuteName) {
		this.reserveParachuteName = reserveParachuteName;
	}

	public String getADDName() {
		return ADDName;
	}

	public void setADDName(String aDDName) {
		ADDName = aDDName;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Parachute [id=" + id + ", mainParachuteName=" + mainParachuteName + "]";
	}
}
