package www.uniregal.ma.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import www.uniregal.ma.Beans.*;
import www.uniregal.ma.DAO.*;

@Service
public class AdminServiceImpl implements UserDetailsService {
	
	@Autowired
	AdminDAO adminDAO;

	
	  @Override 
	  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	  { 
		  Admin admin = adminDAO.findByUsername(username);
		  if(admin == null) {
			  throw new UsernameNotFoundException("[-] Admin NOT FOUND !! "); 
		  	}
		  	return new AdminPrincipal(admin); 
		 }
	 

}
