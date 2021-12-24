package buvette.ma.demo.swagger.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import buvette.ma.demo.swagger.Beans.LigneCmd;

@Repository
public interface LigneCmdDAO extends JpaRepository<LigneCmd, Long>{

	
	
}
