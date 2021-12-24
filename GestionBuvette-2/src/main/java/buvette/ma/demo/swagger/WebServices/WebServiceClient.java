package buvette.ma.demo.swagger.WebServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import buvette.ma.demo.swagger.Services.Impl.ClientServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/clients")
@Api("Gestion-buvette-client")
public class WebServiceClient {

	@Autowired
	ClientServiceImpl clientServiceImpl;

	
	@PostMapping("/login/{username}/{password}")
	@ApiOperation("Cette methode permet d'authentification")
	public String Connexion(@PathVariable String username,@PathVariable String password) {
		return clientServiceImpl.Connexion(username, password);
	}
    @PostMapping("/commander/name/{name}")
	@ApiOperation("Cette methode permet de commander un produit d'apres le nom d'un produit")
    public String CommanderProduitByNom(@PathVariable String name) {
		return clientServiceImpl.CommanderProduitByNom(name);
	}
    @PostMapping("/annulerCommande/ref/{ref}")
	@ApiOperation("Cette methode permet d'annuler un produit")
    public String AnnulerCommande(@PathVariable String Ref) {
		return clientServiceImpl.AnnulerCommande(Ref);
	}
    

}
