package buvette.ma.demo.swagger.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import buvette.ma.demo.swagger.Beans.Produit;

@Repository
public interface ProduitDAO extends JpaRepository<Produit, Long>{

	public  Produit findByRef(Long ref);
	//public List<Produit> findByPrixGreatherThan(Double prix);
	public List<Produit> findAll();
	public List<Produit> findByPrixLessThan(Double prix);
	public Produit findByNom(String nom);
}
