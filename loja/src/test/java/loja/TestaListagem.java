package loja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@10.9.0.51:1521:drhev", "rhev", "katsuragui");
		
//		Statement statement = connection.createStatement();
//		boolean resultado = statement.execute("select * from funcionarios f where f.id = 681962");
//		ResultSet resultSet = statement.getResultSet();
//		resultSet.next();
//		String nome = resultSet.getString("nome");
//		System.out.println(nome);
//		resultSet.close();
//		statement.close();
		
		
		Statement statement2 = connection.createStatement();
		boolean resultado2 = statement2.execute("select * from funcionarios f where f.id > 700000");
		ResultSet resultSet2 = statement2.getResultSet();
		
		while(resultSet2.next()){
			String nome2 = resultSet2.getString("nome");
			System.out.println(nome2);
		}
		
		resultSet2.close();
		statement2.close();
		
		
		
		
		
		connection.close();
	}
}
