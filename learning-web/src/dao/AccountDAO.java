package dao;

import java.util.ResourceBundle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AccountDAO {

	ResourceBundle rb = ResourceBundle.getBundle("db");
	private final String JDBC_URL = rb.getString("JDBC_URL");;
	private final String JDBC_USER = rb.getString("JDBC_USER");;
	private final String JDBC_PASS = rb.getString("JDBC_PASS");;
}
