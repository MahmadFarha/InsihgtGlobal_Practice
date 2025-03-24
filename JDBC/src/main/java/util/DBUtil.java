package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import exception.ConnectionNotFoundException;

public class DBUtil {
	public static Connection getConnection() throws ConnectionNotFoundException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ig", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
