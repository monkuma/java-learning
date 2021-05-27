package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import model.Account;
import model.Login;

public class RegisterFormListDAO {

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

	//RegisterForm_listにurl,mailを挿入
	public boolean insertRegisterFormList(String mail, String url) {
		Connection conn = createConnection();

		try {

			System.out.println("mail:  " + mail + " URL: " + url);
			String sql = "INSERT INTO registerform_list (mail, url) VALUES (?, ?)";
			System.out.println("SQL:  " + sql);
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, mail);
			pStmt.setString(2, url);

			int rs = pStmt.executeUpdate();

			if(rs != 0) {
				return true;
			}
		}catch(SQLException e) {
			System.out.println("insertRegisterFormList　失敗");
			e.printStackTrace();
		}finally{
			closeConnection(conn);
		}
		System.out.println("insertRegisterFormList　失敗");
		return false;
	}

	//URLが有効化確認します
	public String findMailByUrl(String url) {
		Connection conn = createConnection();
		String mail = null;
		try {

			String sql = "SELECT mail FROM registerform_list WHERE url = ? AND created_at >= NOW() - interval 1 hour";

			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, url);

			ResultSet rs = pStmt.executeQuery();

			if(rs.next()) {
				mail = rs.getString("mail");
				System.out.println("findMailByUrl: " + mail);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			closeConnection(conn);
		}
		return mail;
	}

	//Mailが有効化確認します
	public boolean checkMail(String mail) {
		Connection conn = createConnection();

		try {

			String sql = "SELECT * FROM registerform_list WHERE mail = ? AND created_at >= NOW() - interval 1 hour";
			System.out.println(sql);

			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, mail);
			System.out.println(sql);

			ResultSet rs = pStmt.executeQuery();
			System.out.println(rs + " mail: "  + mail);

			if(rs.next()) {
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			closeConnection(conn);
		}
		return false;
	}

}
