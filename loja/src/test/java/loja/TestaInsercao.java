package loja;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
	public static void main(String[] args) throws SQLException {
		
		try (Connection connection = Database.getConnection()) {
		connection.setAutoCommit(false); //Desabilita auto commit.
		
		try{
			String sql = "insert into produtos(id, nome, descricao) values(?, ?, ?)";
			try(PreparedStatement statement = connection.prepareStatement(sql)) {
			
			adiciona(2, "Blueray", "FULL HDMI", statement);
			adiciona(3, "TV LCD", "32 polegadas", statement);
			connection.commit();
		}
			} catch(Exception ex){
				ex.printStackTrace();
				connection.rollback();
				System.out.println("Rollback efetuado.");
			}
		}
	}
	

	private static void adiciona(int id, String nome, String descricao, PreparedStatement statement)
			throws SQLException {
		
		if(nome.equals("TV LCD")){
			throw new IllegalArgumentException("Problema ocorrido");
		}
		
		statement.setInt(1, id);
		statement.setString(2, nome);
		statement.setString(3, descricao);
		
		
		boolean resultado = statement.execute(); //Neste caso não precisa passar parametro. SQL já foi apontado acima.
		System.out.println(resultado); //Retorna true caso seja uma lista de valor, retorna false caso seja alguma alteracao no banco <> de consulta.
	}
}
