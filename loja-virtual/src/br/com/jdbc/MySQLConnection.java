package br.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLConnection {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		 String driver = "com.mysql.jdbc.Driver";
		    String connection = "jdbc:mysql://localhost:3306/sys";
		    String user = "root";
		    String password = "root";
		    Class.forName(driver);
		    Connection con = DriverManager.getConnection(connection, user, password);
		    if (!con.isClosed()) {
		      con.close();
		    }
	}
}
