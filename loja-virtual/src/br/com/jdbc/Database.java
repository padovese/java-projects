package br.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	static Connection getConnection(String databaseName) throws SQLException {
		if(databaseName.equals("Oracle")) {
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@10.9.0.51:1521:drhev", "rhev",
				"katsuragui");
		return connection;
		}
		else if(databaseName.equals("MySQL")) {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root",
					"root");
			return connection;
		}
		else {
			Connection connection = DriverManager.getConnection(databaseName);
			return connection;
		}
	}
}
