package pl.coderslab.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Future;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Parachute {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String mainParachuteName;
	
	@NotBlank
	private String reserveParachuteName;
	
	@NotBlank
	private String ADDName;
	
	private Date expirationDate;
	
	@ManyToOne
	private User user;
	
	private String type;

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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


	@Override
	public String toString() {
		return "Parachute [id=" + id + ", mainParachuteName=" + mainParachuteName + "]";
	}
}
