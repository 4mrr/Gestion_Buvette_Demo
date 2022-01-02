package www.uniregal.ma.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import www.uniregal.ma.Beans.Admin;

@Repository
public interface AdminDAO extends JpaRepository<Admin, Long> {
	
	public Admin findByUsername(String username);
	
	

}
