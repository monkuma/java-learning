package model;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.util.ResourceBundle;
import dao.AccountDAO;


public class LoginLogic {
	public Account execute(Login login) {
		Account account = null;
		try {

			ResourceBundle rb = ResourceBundle.getBundle("db");
			final String HASH = rb.getString("HASH");

			MessageDigest md = MessageDigest.getInstance(HASH);
			byte[] hash = md.digest(login.getPass().getBytes());
			String hashPass =new String(hash);
			login.setPass(hashPass);

			AccountDAO dao = new AccountDAO();
			account = dao.findByLogin(login);

		}catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		if(account != null) {
			return account;
		}else {
			return null;
		}


	}

}
