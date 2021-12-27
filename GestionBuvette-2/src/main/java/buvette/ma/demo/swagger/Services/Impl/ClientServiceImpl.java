package buvette.ma.demo.swagger.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import buvette.ma.demo.swagger.Beans.Client;
import buvette.ma.demo.swagger.Beans.Produit;
import buvette.ma.demo.swagger.DAO.ClientDAO;
import buvette.ma.demo.swagger.DAO.LigneCmdDAO;
import buvette.ma.demo.swagger.DAO.ProduitDAO;
import buvette.ma.demo.swagger.Services.Facade.ClientServices;

@Service
public class ClientServiceImpl implements ClientServices {

	@Autowired
	ClientDAO clientDAO;
	@Autowired
	ProduitDAO produitDAO;
	@Autowired
	LigneCmdDAO ligneCmdDAO;
	
	@Override
	public String Connexion(String username, String password) {
		Client client = clientDAO.findByUsername(username);
		if(client != null) 
		{
			if(client.getPassword().equals(password)) 
			{
				return "[+] Welcome "+client.getUsername()+" To UniRegal";
			}
			return "[!] The Password Of "+client.getUsername()+" is Incorrect";
		}
		return "[-] The user NOT FOUND !!";
	}

	@Override
	public String CommanderProduitByNom(String name) {
		Produit produit = produitDAO.findByNom(name);
		if(produit != null && produit.getExite()== true) 
		{
			//ligneCmdDAO.save(produit);
			//ligneCmdDAO.save(client);
		}
		return null;
	}

	@Override
	public String AnnulerCommande(String Ref) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
