package buvette.ma.demo.swagger.Beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client implements Serializable{

	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	private String username;
	//@Email(regexp=".*@.*\\..*", message = "Email should be valid")
	private String email;
	private Double solde;
	private String password;

	
	public Client() {
		super();
	}

	public Client(Long id, String username, String email, String password,Double solde) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.solde=solde;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
	

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", username=" + username + ", email=" + email + ", solde=" + solde + ", password="
				+ password + "]";
	}



	

	
		
}

