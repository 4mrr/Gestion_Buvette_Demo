package WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import Services.Admin_Impl;

@Controller
@RequestMapping("/ensat-buvette/admin")
public class AdminWebService {

	@Autowired
	Admin_Impl admin_Impl;

	
	@PostMapping("/connecter/{username}/{password}")
	public int Connecter(@PathVariable String username,@PathVariable String password) {
		return admin_Impl.Connecter(username, password);
	}

	@DeleteMapping("/deleteClient/{apogee}")
	public int deleteClientByApogee(@PathVariable String username) {
		return admin_Impl.deleteClientByUsername(username);
	}

	@PostMapping("/saveClient/{username}")
	public int SaveClientByApogee(@PathVariable String username) {
		return admin_Impl.SaveClientByUsername(username);
	}

	@PutMapping("/modifierClient/{username}")
	public int modifierClientByUsername(@PathVariable String username) {
		return admin_Impl.modifierClientByUsername(username);
	}

}
