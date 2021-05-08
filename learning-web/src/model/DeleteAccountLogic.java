package model;
import dao.AccountDAO;
public class DeleteAccountLogic {
	public boolean execute(String mail, String name) {


		AccountDAO dao = new AccountDAO();
		boolean result = dao.deleteAccount(mail, name);
		return result;


	}

}
