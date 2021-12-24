package buvette.ma.demo.swagger.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import buvette.ma.demo.swagger.Beans.Produit;
import buvette.ma.demo.swagger.DAO.ProduitDAO;
import buvette.ma.demo.swagger.Services.Facade.ClientServices;

@Service
public class ClientServiceImpl implements ClientServices {

	@Autowired
	ProduitDAO produitDAO;

	
	@Override
	public String Connexion(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String CommanderProduitByNom(String name) {
		Produit produit = produitDAO.findByNom(name);
		if(produit != null && produit.getExite()== true) 
		{
			//if()
		}
		return null;
	}

	@Override
	public String AnnulerCommande(String Ref) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
