package br.com.dealership.bean;

public class Client extends User{

	private String login;
	private String password;
	private Double money;
	
	public Client() {}
	
	public Client(Integer id, String name, String login, String password, Double money) {
		super(id, name);
		this.login = login;
		this.password = password;
		this.money = money;
	}
	
	public Double getMoney() {
		return money;
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
