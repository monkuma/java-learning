package dao;

import java.util.ResourceBundle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Account;
import model.Login;


public class AccountDAO {

	ResourceBundle rb = ResourceBundle.getBundle("db");
	private final String JDBC_URL = rb.getString("JDBC_URL");
	private final String DB_USER = rb.getString("DB_USER");
	private final String DB_PASS = rb.getString("DB_PASS");

	// DB との接続を確立する
	private Connection createConnection(){
		Connection conn = null;
		try{
			//JDBC ドライバの読み込み
			Class.forName("org.mariadb.jdbc.Driver");

			System.out.println(JDBC_URL);

			//DB に接続
			conn = DriverManager.getConnection( JDBC_URL, DB_USER, DB_PASS);

			//JDBC ドライバが無い時のエラー
			} catch(ClassNotFoundException e) {
				System.out.println("JDBC ドライバが見つかりません。");
				e.printStackTrace();
			 //SQL 処理関係の失敗
			} catch(SQLException e) {
				System.out.println("DB アクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			return conn;
	}

	// DB との接続を閉じる
	private void closeConnection(Connection con){
		try{
			if (con != null){
				con.close();
			}

		} catch (SQLException e) {
			System.out.println("DB 切断時にエラーが発生しました。");
			e.printStackTrace();
		}
	}

	public Account findByLogin(Login login) {
		Connection conn = createConnection();
		Account account = null;

		try {

			String sql = "SELECT  mail, pass FROM account WHERE mail = ? AND pass = ?";

			System.out.println(sql);

			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, login.getMail());
			pStmt.setString(2, login.getPass());
			System.out.println(sql);

			ResultSet rs = pStmt.executeQuery();

			if(rs.next()) {
				String name = rs.getString("name");
				String pass = rs.getString("pass");
				String mail = rs.getString("mail");
				account = new Account(name, pass, mail);

			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		closeConnection(conn);
		return account;
	}
}
