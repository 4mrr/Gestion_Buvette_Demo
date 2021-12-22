package DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Beans.Admin;

@Repository
public interface AdminDAO extends JpaRepository<Admin, Long> {
	
	public Admin findByUsername(String username);
	public List<Admin> findAll();
	

}
