package buvette.ma.demo.swagger.Services.Facade;

public interface ClientServices {

	//Authentification
	public String Connexion(String username , String password);
	
	//Les services possible pour un client sur un produits
	public String CommanderProduitByNom(String name);
	public String AnnulerCommande(String Ref);
	
}
