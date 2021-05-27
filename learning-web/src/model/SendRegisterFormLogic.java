package model;

import java.util.Properties;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.UUID;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


import java.util.regex.Pattern;

import dao.AccountDAO;
import dao.RegisterFormListDAO;

public class SendRegisterFormLogic {

	public boolean execute(String mail) {
		AccountDAO accountDao = new AccountDAO();
		boolean rs = false;

		boolean isEnabled = accountDao.registerCheck(mail);
		boolean isMail = checkMailPattern(mail);

		if(isEnabled && isMail) {
			String randomUrl = getRandomString();
			RegisterFormListDAO rflDao = new RegisterFormListDAO();
			boolean insertRegisterForm = rflDao.insertRegisterFormList(mail, randomUrl);

			if(insertRegisterForm) {
				sendRegisterForm(mail, randomUrl);
				rs = true;
			}else {
				return rs;
			}
		}

		return rs;

	}


	private String getRandomString() {
		Random rnd = new Random();
		long randomLong = rnd.nextLong();
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString();
		String randomUrl = id+randomLong;

		System.out.println("URL: " + randomUrl);

		return randomUrl;
	}

	private boolean checkMailPattern(String mail) {
		String pattern = "^([a-zA-Z0-9])+([a-zA-Z0-9\\._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9\\._-]+)+$";
		Pattern p = Pattern.compile(pattern);
		if(p.matcher(mail).find()) {
			return true;
		}

		return false;
	}
	private boolean sendRegisterForm(String mail, String randomUrl) {
		String mailBody = "<p>このたびはLean Javaに仮登録していただきありがとうございます。</p><p>以下のURLから本登録お願いいたします。</p>";
		String url = "https://learn-java.net/RegisterServlet?target=" + randomUrl;
		String mailUrl = "<p>本登録ページ:<a href=" + url +">" + url +"</a></p>";
		String mailFooter ="<p>1時間以内に本登録を行ってください。</p><p>※本メールはサーバーからの自動返信メールとなっております。<br>本メールに返信いただいてもご連絡いたしかねますのでご了承ください。</p><p>【Learn Java】 https://learn-java.net</p>";
		String mailContent = mailBody + mailUrl + mailFooter;

		boolean rs = false;
		ResourceBundle rb = ResourceBundle.getBundle("db");

		final String mID = rb.getString("mID");
		final String mPW = rb.getString("mPW");
		final String mHst = rb.getString("mHst");

		Properties prop = System.getProperties();
		prop.setProperty("mail.smtp.host", mHst);
		prop.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		prop.setProperty("mail.smtp.socketFactory.fallback", "false");
		prop.setProperty("mail.smtp.socketFactory.port", "465");
		prop.setProperty("mail.smtp.auth", "true");
		prop.setProperty("mail.smtp.connectiontimeout", "5000");
		prop.setProperty("mail.smtp.timeout", "5000");
		prop.setProperty("mail.debug", "true");
		prop.setProperty("mail.debug.auth", "true");

		Session ses = Session.getDefaultInstance(
				prop,
				new Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(mID, mPW);
					}
				}
				);
		try {
			MimeMessage mm = new MimeMessage(ses);
			mm.setFrom(new InternetAddress("info@learn-java.net", "info", "iso-2022-jp"));
			mm.setRecipients(Message.RecipientType.TO, mail);
			mm.setSubject("【Learn Java】 仮登録ありがとうございます。", "iso-2022-jp");
			mm.setContent(mailContent, "text/html; charset=iso-2022-jp");
			Transport.send(mm);
			rs = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return rs;

	}


}
