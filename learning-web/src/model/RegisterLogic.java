package model;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;
import java.security.MessageDigest;
import dao.AccountDAO;
import dao.RegisterFormListDAO;


public class RegisterLogic {
	AccountDAO dao = new AccountDAO();
	private boolean hasBlank;
	private boolean PassGeSix;
	private boolean validMail;

	public boolean execute(Account account) {

		hasBlank = checkBlank(account);
		validMail = validMail(account);
		PassGeSix = checkTheLengthOfPass(account);

		AccountDAO accountDao = new AccountDAO();
		boolean isEnabled = accountDao.registerCheck(account.getMail());
		System.out.println(hasBlank + " " + validMail + " " + PassGeSix);


		if(hasBlank && validMail && PassGeSix && isEnabled) {

			try {
				ResourceBundle rb = ResourceBundle.getBundle("db");
				final String HASH = rb.getString("HASH");

				//未記入でない、アドレスが使用済みでない、Passが6文字以上で登録処理
				MessageDigest md = MessageDigest.getInstance(HASH);
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

	//メールアドレス有効化確認します
	private boolean validMail(Account account) {
		RegisterFormListDAO dao = new RegisterFormListDAO();
		validMail = dao.checkMail(account.getMail());

		return validMail;
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
