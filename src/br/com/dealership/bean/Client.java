package br.com.dealership.bean;

public class Client extends User{

	private String login;
	private String password;
	
	public Client() {}
	
	public Client(Integer id, String name, String login, String password) {
		super(id, name);
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
