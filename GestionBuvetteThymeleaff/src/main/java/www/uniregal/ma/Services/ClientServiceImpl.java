package www.uniregal.ma.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.uniregal.ma.Beans.*;
import www.uniregal.ma.DAO.*;

@Service
public class ClientServiceImpl {
	
	@Autowired
	ClientDAO clientDAO;

	public void save(Client client) 
	{	
		clientDAO.save(client);
	}
	  
	  
	 

}
