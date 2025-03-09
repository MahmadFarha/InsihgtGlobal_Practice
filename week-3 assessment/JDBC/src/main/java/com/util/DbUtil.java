package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public static Connection getConnection() throws SQLException{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ig","root","root");
			return con;
		}
		catch(ClassNotFoundException e) {
			throw new SQLException(e);
		}
		catch(SQLException e) {
			throw new SQLException(e);
		}
	
	}
}
