package model;

import dao.RegisterFormListDAO;

public class RegisterPageLogic {
	private String mail;

	public String execute(String url) {
		RegisterFormListDAO dao = new RegisterFormListDAO();
		mail = dao.findMailByUrl(url);

		return mail;
	}



}
