package loja;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import DAO.ProdutosDAO;
import modelo.Produto;

public class TestaDAOProduto {
	public static void main(String[] args) throws SQLException {
		Produto mesa = new Produto("Mesa Azul", "Mesa azul com 4 pés.");
		
		try(Connection conn = Database.getConnection()){
			ProdutosDAO dao = new ProdutosDAO(conn);
			dao.salva(mesa);
			
			List<Produto> produtos = dao.lista();
			for (Produto produto : produtos) {
				System.out.println("Existe o produto: " + produto);
			}
		}
	}
}