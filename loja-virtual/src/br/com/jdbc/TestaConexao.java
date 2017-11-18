package br.com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) {
		try {
			Connection connection = Database.getConnection("MySQL");
			System.out.println("Abrindo uma conexão com sucesso.");
			connection.close();
		} catch (SQLException e) {
			System.out.println("Erro na conexão.");
			e.printStackTrace();
		} finally {
			System.out.println("Fim do processo.");
		}
	}

}
