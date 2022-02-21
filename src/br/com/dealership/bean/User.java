package br.com.dealership.bean;

public abstract class User {

	private Integer id;
	private String name;
	private String login;
	private String password;
	
	public User(Integer id, String name, String login, String password) {
		this.id = id;
		this.name = name;
		this.login = login;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
