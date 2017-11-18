package br.com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import br.com.jdbc.modelo.Produto;

public class TestaInsercaoDeProduto {

	public static void main(String[] args) throws SQLException {
		Produto mesa = new Produto("Mesa");

		Connection connection = Database.getConnection("MySQL");

		String sql = "insert into products(name) values(?)";
		PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		
		stmt.setString(1, mesa.getName());
		stmt.execute();
		
		
		connection.close();
	}

}
