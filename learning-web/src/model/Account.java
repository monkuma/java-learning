package model;

public class Account {
	private String pass;
	private String name;
	private String mail;

	public Account(String name, String pass, String mail) {

		this.pass = pass;
		this.name = name;
		this.mail = mail;
	}

	public String getPass() {
		return pass;
	}
	public String getName() {
		return name;
	}

	public String getMail() {
		return mail;
	}
}
