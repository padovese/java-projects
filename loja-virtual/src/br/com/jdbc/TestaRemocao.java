package br.com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		Connection connection = Database.getConnection();

		Statement statement = connection.createStatement();
		boolean result = statement.execute("delete from rh_ss.padova");
		System.out.println(result);
		int count = statement.getUpdateCount();
		System.out.println(count);
		statement.close();
		connection.close();
	}

}
