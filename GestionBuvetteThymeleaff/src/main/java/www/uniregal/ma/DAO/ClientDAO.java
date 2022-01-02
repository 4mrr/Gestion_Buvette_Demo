package www.uniregal.ma.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import www.uniregal.ma.Beans.Client;

@Repository
public interface ClientDAO  extends JpaRepository<Client, Long>{

	
	public Client findByUsername(String username);
}
