package loja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	
	static Connection getConnection() throws SQLException{
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@10.9.0.51:1521:drhev", "rhev", "katsuragui");
		return connection;
	}
}
