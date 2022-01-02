package www.uniregal.ma.WebServices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import www.uniregal.ma.Beans.Client;
import www.uniregal.ma.Services.AdminServiceImpl;
import www.uniregal.ma.Services.ClientServiceImpl;


@Controller
public class AppController {

	@Autowired
	AdminServiceImpl adminServiceImpl ;
	@Autowired
	ClientServiceImpl clientServiceImpl;
	
	@GetMapping("/login") 
	public String login() 
	{ 
		return "/login.html"; 
	}

	@GetMapping("/index")
	public String index() 
	{
		return "index";
	}
	
	@PostMapping(value="/users/addNew")
	public RedirectView addNew(Client client, RedirectAttributes redir) {
		clientServiceImpl.save(client);	
		RedirectView  redirectView= new RedirectView("/login",true);
	        redir.addFlashAttribute("message",
	    		"You successfully registered! You can now login");
	    return redirectView;				
	}	
	
} 
