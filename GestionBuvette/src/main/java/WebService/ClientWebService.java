package WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Beans.Client;
import Services.Client_Impl;

@Controller
@RequestMapping("/ensat-buvette")
public class ClientWebService {

	@Autowired
	Client_Impl client_Impl;
	@PostMapping("/connecter/{mail}/{password}")
	public int Connecter(@PathVariable String mail,@PathVariable String password) {
		return client_Impl.Connecter(mail, password);
	}
	
	@PostMapping("/inscription")
	public String greetingSubmit(@ModelAttribute Client client, Model model) {
	   model.addAttribute("client", client);
	   return "dashboard";
	  }

	
}
