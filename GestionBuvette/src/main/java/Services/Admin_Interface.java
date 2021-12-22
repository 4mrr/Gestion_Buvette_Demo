package Services;

public interface Admin_Interface {

	public int Connecter(String username,String password);
	public int deleteClientByUsername(String username);
	public int SaveClientByUsername(String username);
    public int modifierClientByUsername(String username);
	 
}
