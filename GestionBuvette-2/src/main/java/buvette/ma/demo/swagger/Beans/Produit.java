package buvette.ma.demo.swagger.Beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long ref;
	private String nom;
	private Double prix;
	private Boolean exite;
	
	public Produit() {
		super();
	}

	public Produit(Long ref, String nom, Double prix, Boolean exite) {
		super();
		this.ref= ref;
		this.nom = nom;
		this.prix = prix;
		this.exite = exite;
	}

	public Long getRef() {
		return ref;
	}

	public void setRef(Long ref) {
		this.ref= ref;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Boolean getExite() {
		return exite;
	}

	public void setExite(Boolean exite) {
		this.exite = exite;
	}

	@Override
	public String toString() {
		return "Produit [ref=" + ref + ", nom=" + nom + ", prix=" + prix + ", exite=" + exite + "]";
	}


	
	
	
}
