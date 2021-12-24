package buvette.ma.demo.swagger.Beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LigneCmd  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	private Client client;
	private Produit produit;
	private Date date;
	
	
	
	public LigneCmd() {
		super();
	}

	public LigneCmd(Client client, Produit produit, Date date) {
		super();
		this.client = client;
		this.produit = produit;
		this.date = date;
	}

	public LigneCmd(Long id, Client client, Produit produit, Date date) {
		super();
		this.id = id;
		this.client = client;
		this.produit = produit;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
	
	
}
