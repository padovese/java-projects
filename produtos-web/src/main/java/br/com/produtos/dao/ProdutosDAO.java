package br.com.produtos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.produtos.ConnectionFactory;
import br.com.produtos.model.Produto;

public class ProdutosDAO {

	private Connection connection;
	
	public ProdutosDAO() {
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Produto> lista(){
		try {
			List<Produto> produtos = new ArrayList<Produto>();
			PreparedStatement stmt = this.connection.prepareStatement("select p.id, p.name pname, p.price, c.name cname from productss p, categories c where p.category = c.id");
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Produto produto = new Produto();
				
				produto.setId(rs.getShort("id"));
				produto.setName(rs.getString("pname"));
				produto.setPrice(rs.getDouble("price"));
				produto.setCategory(rs.getString("cname"));
				
				produtos.add(produto);
			}
			
			rs.close();
			stmt.close();
			
			return produtos;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
