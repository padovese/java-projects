package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.jdbc.modelo.Categoria;

public class CategoriasDAO {
	private final Connection con;

	public CategoriasDAO(Connection con) {
		this.con = con;
	}

	public List<Categoria> lista() throws SQLException {
		List<Categoria> categorias = new ArrayList<>();

		String sql = "select * from categoria";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();

			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String nome = rs.getString("nome");
					Categoria categoria = new Categoria(id, nome);
					categorias.add(categoria);
				}
			}
		}
		return categorias;
	}
}
