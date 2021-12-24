package buvette.ma.demo.swagger.Services.Facade;

import java.util.List;

import buvette.ma.demo.swagger.Beans.Admin;
import buvette.ma.demo.swagger.Beans.Client;
import buvette.ma.demo.swagger.Beans.Produit;

public interface AdminServices {

	//Authentication
	public String ConnexionAdmin(String username , String password);
	
	//Gestion des Clients
	
	public String AddClient(Client client);
	public String DeleteClient(Client client);
	public String UpdateClient(Client client);
	public String UpdateClientByUsername(String user);
	public List<Client> getAllClient();
	
	//Gestion des Admins
	public String AddAdmin(Admin admin);
	
	
	//Gestion des Produits
	
	public String AddProduit(Produit produit);
	public String DeleteProduit(Produit produit);
	public String UpdateProduit(Produit produit);
	public String UpdateProduitByRef(String ref);
	public List<Produit> getAllProduit();
	
}
