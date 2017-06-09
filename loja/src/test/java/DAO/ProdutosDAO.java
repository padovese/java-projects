package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Produto;

public class ProdutosDAO {

	private final Connection conn;

	public ProdutosDAO(Connection conn) {
		this.conn = conn;
	}

		public void salva(Produto produto) throws SQLException {
			String sql = "insert into produtos values (seq_produtos.nextval, ?, ?)";
			
			try(PreparedStatement stmt = conn.prepareStatement(sql)){
				stmt.setString(1, produto.getNome());
				stmt.setString(2, produto.getDescricao());
				stmt.execute();
			
				System.out.println(produto);
			
			}
		}

		public List<Produto> lista() throws SQLException {
			List<Produto> produtos = new ArrayList<>();
			String sql = "select * from produtos";
			
			try(PreparedStatement stmt = conn.prepareStatement(sql)){
				stmt.execute();
				
				try(ResultSet rs = stmt.getResultSet()){
					while(rs.next()){
						int id = rs.getInt("id");
						String nome = rs.getString("nome");
						String descricao = rs.getString("descricao");
						Produto produto = new Produto(nome, descricao);
						produto.setId(id);
						produtos.add(produto);
					}
				}
			}
			return produtos;
		}
		
	}
