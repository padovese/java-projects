package br.com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.dao.CategoriasDAO;
import br.com.jdbc.modelo.Categoria;

public class TestaCategoria {
	public static void main(String[] args) throws SQLException {
		Connection con = Database.getConnection();

		List<Categoria> categorias = new CategoriasDAO(con).lista();
		for (Categoria c : categorias) {
			System.out.println(c.getNome());
		}
	}

}
