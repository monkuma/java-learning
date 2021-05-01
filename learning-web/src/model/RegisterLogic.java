package model;

import dao.AccountDAO;

public class RegisterLogic {
	AccountDAO dao = new AccountDAO();
	boolean hasBlank;
	boolean MailisEnabled;
	boolean PassGeSix;

	public boolean execute(Account account) {

		hasBlank = checkBlank(account);
		MailisEnabled = checkMail(account);
		PassGeSix = checkTheLengthOfPass(account);

		if(hasBlank && MailisEnabled && PassGeSix) {
			//未記入でない、アドレスが使用済みでない、Passが6文字以上で登録処理
			boolean result = dao.insertAccount(account);
			return result;
		}
		return false;

	}

		//未入力をチェックします
	private boolean checkBlank(Account account) {

		if(account.getMail().equals("") || account.getName().equals("") || account.getPass().equals("")) {
			return false;
		}else {
			return true;
		}
	}

	//メールアドレスが使用済みでないか確認します
	private boolean checkMail(Account account) {
		MailisEnabled = dao.registerCheck(account.getMail());
		return MailisEnabled;
	}

	//Passが6文字以上でTrue
	private boolean checkTheLengthOfPass(Account account) {
		if(account.getPass().length() >= 6) {
			return true;
		}else {
			return false;
		}
	}

}
