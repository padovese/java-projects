package br.com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		Connection connection = Database.getConnection("Oracle");

		Statement statement = connection.createStatement();

		boolean resultado = statement.execute("select * from funcionarios f where f.id >= 681962");
		System.out.println(resultado);

		ResultSet resultSet = statement.getResultSet();
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String nome = resultSet.getString("nome");
			System.out.println(id + " " + nome.toLowerCase());
		}

		resultSet.close();
		statement.close();
		connection.close();
	}

}
