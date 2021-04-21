package model;

import dao.AccountDAO;

public class RegisterLogic {

	public Account execute(Account account) {
		AccountDAO dao = new AccountDAO();
		Account result = dao.insertAccount(account);
		if(result != null) {
			return result;
		}else {
			return null;
		}

	}

}
