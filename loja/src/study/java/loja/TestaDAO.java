package loja;

import java.awt.List;
import java.sql.Connection;
import java.sql.SQLException;

import DAO.loja.FuncionariosDAO;
import modelo.Funcionarios;
import modelo.Produto;

public class TestaDAO {
	public static void main(String[] args) throws SQLException {
		Funcionarios func = new Funcionarios("Bruno", "Brasileiro");
		
		try(Connection conn = DB.getConnection()){
			FuncionariosDAO dao = new FuncionariosDAO(conn);
			dao.Salva(func);
			
//			List<Funcionarios> funcionarioss = dao.listaFuncionarios();
//			for (Funcionarios funcionarios : funcionarioss) {
//				System.out.println(funcionarioss);
//			}
		}
	}
}