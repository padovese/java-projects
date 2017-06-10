package loja;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import DAO.CategoriasDAO;
import DAO.ProdutosDAO;
import modelo.Categoria;
import modelo.Produto;

public class TestaCategorias {
	public static void main(String[] args) throws SQLException {
		try(Connection conn = Database.getConnection()){
			List<Categoria> categorias = new CategoriasDAO(conn).lista();
			
			for(Categoria categoria : categorias){
				System.out.println(categoria.getNome());
				
				for(Produto produto : new ProdutosDAO(conn).busca(categoria)){
					System.out.println(categoria.getNome() + " - " + produto.getNome());
				}
			}
		}
	}
}
