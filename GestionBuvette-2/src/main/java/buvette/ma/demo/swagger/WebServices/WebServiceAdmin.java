package buvette.ma.demo.swagger.WebServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import buvette.ma.demo.swagger.Beans.Admin;
import buvette.ma.demo.swagger.Beans.Client;
import buvette.ma.demo.swagger.Beans.Produit;
import buvette.ma.demo.swagger.Services.Impl.AdminServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/admin")
@Api("Gestion-Buvette-Admin")
public class WebServiceAdmin {

	@Autowired
	AdminServiceImpl adminServiceImpl;

	@PostMapping("/{useranme}/{password}")
	@ApiOperation("Cette methode permet d'authentification")
	public String ConnexionAdmin(@PathVariable String username,@PathVariable String password) {
		return adminServiceImpl.ConnexionAdmin(username, password);
	}
	
	@PostMapping("/addClient/")
	@ApiOperation("Methode permet d'ajouter des clients")
	public String AddClient(@RequestBody Client client) {
		return adminServiceImpl.AddClient(client);
	}
	
	@DeleteMapping("/deleteClient/")
	@ApiOperation("Cette methode permet de supprimer un client")
	public String DeleteClient(@RequestBody Client client) {
		return adminServiceImpl.DeleteClient(client);
	}
	
	@PutMapping("/updateClient/")
	@ApiOperation("Cette methode permet d'updater un client")
	public String UpdateClient(@RequestBody Client client) {
		return adminServiceImpl.UpdateClient(client);
	}
	@GetMapping("/allClient/")
	@ApiOperation("Cette methode permet de get all clients")
	public List<Client> getAllClient() {
		return adminServiceImpl.getAllClient();
	}
	@PostMapping("/addAdmin")
	@ApiOperation("Cette methode permet d'ajouter un client")
	public String AddAdmin(@RequestBody Admin admin) {
		return adminServiceImpl.AddAdmin(admin);
	}
	@PostMapping("/addProduit/")
	@ApiOperation("Cette methode permet d'ajouter un produit")
	public String AddProduit(@RequestBody Produit produit) {
		return adminServiceImpl.AddProduit(produit);
	}
	@DeleteMapping("/deleteProduit")
	@ApiOperation("Cette methode permet de supprimer un produit")
	public String DeleteProduit(@RequestBody Produit produit) {
		return adminServiceImpl.DeleteProduit(produit);
	}
	@PutMapping("/updaterProduit")
	@ApiOperation("Cette methode permet d'updater un produit")
	public String UpdateProduit(@RequestBody Produit produit) {
		return adminServiceImpl.UpdateProduit(produit);
	}
	@PutMapping("/updaterProduit/ref/{ref}")
	@ApiOperation("Cette methode permet d'updater un produit d'apres son Ref")
	public String UpdateProduitByRef(@PathVariable String ref) {
		return adminServiceImpl.UpdateProduitByRef(ref);
	}	
}
