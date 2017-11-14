package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.com.jdbc.Produto;

public class ProdutosDAO {

	private Connection con;

	public ProdutosDAO(Connection con) {
		this.con = con;
	}

	public void salva(Produto produto) throws SQLException {
		String sql = "insert into produto(name, desc) values(?, ?)";

		try (PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			stmt.setString(1, produto.getName());
			stmt.setString(2, produto.getDesc());
			stmt.execute();

			try (ResultSet rs = stmt.getGeneratedKeys()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					produto.setId(id);
				}
			}
		}

	}

	public List<Produto> lista() throws SQLException {
		String sql = "select * from produto";
		// try(PreparedStatement stmt = con.prepareStatement(sql)){
		// stmt.execute();
		//
		// try(ResultSet rs = stmt.getResultSet()){
		// while(rs.next()) {
		// new Produto()
		// }
		// }
		// }
		return null;
	}
}
