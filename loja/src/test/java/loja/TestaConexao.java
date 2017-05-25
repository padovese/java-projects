package loja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@10.9.0.51:1521:drhev", "rhev", "katsuragui");
		System.out.println("Conectado com sucesso.");
		connection.close();
	}
}