package com.mtc.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO {
	
	public Connection getConnection() {
		
		Connection connection = null;
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?useSSL=false", "root", "Root@123");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}

}
