package model;

import dao.AccountDAO;

public class RegisterLogic {
	AccountDAO dao = new AccountDAO();
	boolean isBlank;
	boolean isEnabled;

	public boolean execute(Account account) {


		isBlank = checkBlank(account);
		isEnabled = checkMail(account);

		if(isBlank == false && isEnabled == true) {
			//未記入でない、アドレスが使用済みでなければ登録処理
			boolean result = dao.insertAccount(account);
			return result;
		}
		return false;

	}

	//未入力をチェックします
	private boolean checkBlank(Account account) {

		if(account.getMail().equals("") || account.getName().equals("") || account.getPass().equals("")) {
			return true;
		}else {
			return false;
		}
	}

	//メールアドレスが使用済みでないか確認します
	private boolean checkMail(Account account) {
		isEnabled = dao.registerCheck(account.getMail());
		return isEnabled;
	}

}
