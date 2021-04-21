package model;
import dao.AccountDAO;


public class LoginLogic {
	public Account execute(Login login) {
		AccountDAO dao = new AccountDAO();
		Account account = dao.findByLogin(login);
		if(account != null) {
			return account;
		}else {
			return null;
		}
	}

}
