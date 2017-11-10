package br.com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaInsercao {
	public static void main(String[] args) throws SQLException {
		Connection connection = Database.getConnection();

		String sql = "insert into rh_ss.padova values(?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		adiciona("Notebook", statement);
		adiciona("Geladeira", statement);

		statement.close();
		connection.close();
	}

	private static void adiciona(String descricao, PreparedStatement statement) throws SQLException {
		statement.setString(1, descricao);

		boolean resultado = statement.execute();
		System.out.println("Retorna lista de resultados? " + resultado);
		System.out.println(statement.getUpdateCount() + " linha(s) inserida(s)");
	}
}
