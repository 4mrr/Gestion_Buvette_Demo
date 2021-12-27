package buvette.ma.demo.swagger.Services.Impl;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import buvette.ma.demo.swagger.Beans.Admin;
import buvette.ma.demo.swagger.Beans.Client;
import buvette.ma.demo.swagger.Beans.Produit;
import buvette.ma.demo.swagger.DAO.AdminDAO;
import buvette.ma.demo.swagger.DAO.ClientDAO;
import buvette.ma.demo.swagger.DAO.ProduitDAO;
import buvette.ma.demo.swagger.Services.Facade.AdminServices;


@Service
public class AdminServiceImpl implements AdminServices {

	@Autowired
	ClientDAO clientDAO;

	@Autowired
	ProduitDAO produitDAO;
	
	@Autowired
	AdminDAO adminDAO;

	@Override
	public String ConnexionAdmin(String username, String password) {
		Admin admin = adminDAO.findByUsername(username);
		if(admin != null) 
		{
			if(admin.getPassword().equals(password)) 
			{
				return "[+] Welcome ADMIN "+admin.getUsername()+" To UniRegal";
			}
			return "[!] The Password Of THE ADMIN "+admin.getUsername()+" is Incorrect";
		}
		return "[-] The ADMIN NOT FOUND !!";
	}
	

	@SuppressWarnings("null")
	@Override
	public String AddClient(Client client) {
		Client client2 = clientDAO.findByUsername(client.getUsername());
		if(client2 == null) 
		{
			clientDAO.save(client2);
			return "[+] Client "+ client2.getUsername() + "Has been Added";
		}
		return "[-] Client is already exist ";
	}

	@Transactional
	@Override
	public String DeleteClient(Client client) {
		Client client2 = clientDAO.findByUsername(client.getUsername());
		if(client2!= null ) 
		{
		  clientDAO.delete(client);	
		  return "[+] Client "+ client.getUsername() + "Has been Deleted";
		}
		return "[-] Client is already NOT exist ";
	}

	@Override
	public String UpdateClient(Client client) {
		Client client2 = clientDAO.findByUsername(client.getUsername());
		if(client2 != null ) 
		{
		 Client newClient = new Client();
		 newClient.setUsername(client.getUsername());
		 newClient.setPassword(client.getPassword());
		 newClient.setEmail(client.getEmail());
		 
		 clientDAO.save(newClient);
		 return "[+] Client "+ client.getUsername() + "Has been Updated";
		} 
		return  "[-] Client is already NOT exist ";
	}

	@Override
	public String UpdateClientByUsername(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> getAllClient() {
		return clientDAO.findAll();
	}

	@Override
	public String AddAdmin(Admin admin) {
		if (adminDAO.findByUsername(admin.getUsername())==null) 
		{
		 if(admin.getRole()== "Super") 
		 {
		   return "[-] Impossible of creating this Super Role !!"; 
		 }else 
		 {
			 adminDAO.save(admin);
			 return "[+] Admin "+admin.getUsername()+" Has been Added !";
		 } 	
		}
		return "[-] Admin is already Exist !";
	}

	@Override
	public String AddProduit(Produit produit) {
		if(produitDAO.findByRef(produit.getRef()) == null) 
		{
		   produitDAO.save(produit);
		   return "[+] Product "+produit.getNom()+" Has Been Added ";
		}
		return "[-] Product is already Exist !";
	}

	@Override
	public String DeleteProduit(Produit produit) {
		if(produitDAO.findByRef(produit.getRef()) != null) 
		{
			produitDAO.delete(produit);
			return "[+] Product "+produit.getNom()+" Has Been Deleted ";
		}
		return "[-] Product is already NOT Exist !";
	}

	@Override
	public String UpdateProduit(Produit produit) {
		if(produitDAO.findByRef(produit.getRef()) != null) 
		{
			 Produit newProduit = new Produit();
			 newProduit.setRef(produit.getRef());
			 newProduit.setNom(produit.getNom());
			 newProduit.setExite(true);
			 newProduit.setPrix(produit.getPrix());
			 
			 produitDAO.save(newProduit);
			 return "[+] Product "+produit.getNom()+" Has Been Updated";
		}
		return "[-] Product is already NOT EXIST ! ";
	}

	@Override
	public String UpdateProduitByRef(String ref) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> getAllProduit() {
		return produitDAO.findAll();
	}
	

	
}
