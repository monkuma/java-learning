package model;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
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

			try {
				//未記入でない、アドレスが使用済みでない、Passが6文字以上で登録処理
				MessageDigest md = MessageDigest.getInstance("SHA-256");
				byte[] hash = md.digest(account.getPass().getBytes());
				String hashPass =new String(hash);
				account.setPass(hashPass);
				boolean result = dao.insertAccount(account);
				return result;
			}catch(NoSuchAlgorithmException e) {
				e.printStackTrace();
			}

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
