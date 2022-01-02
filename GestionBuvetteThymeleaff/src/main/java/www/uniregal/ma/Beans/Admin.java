package www.uniregal.ma.Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;



@Entity
public class Admin {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	@NonNull
	private String username;
	@NonNull
	private String password;
	
	
	public Admin(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public Admin() {
		super();
	}
	
	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	
	/*
	 * @Override public Collection<? extends GrantedAuthority> getAuthorities() {
	 * 
	 * return Collections.singleton(new SimpleGrantedAuthority("ADMIN")); } public
	 * String getPassword() { return password; } public String getUsername() {
	 * return username; }
	 * 
	 * @Override public boolean isAccountNonExpired() { return true; }
	 * 
	 * @Override public boolean isAccountNonLocked() { return true; }
	 * 
	 * @Override public boolean isCredentialsNonExpired() { return true; }
	 * 
	 * @Override public boolean isEnabled() { return true; }
	 * 
	 */
	
}
