package loja;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {
	public static void main(String[] args) throws SQLException {
		Connection connection = Database.getConnection();
		
		Statement statement = connection.createStatement();
		statement.execute("delete from produtos where id = 1");
		int updateCount = statement.getUpdateCount(); //Número de linhas atualizadas.
		System.out.println(updateCount);
		statement.close();
		
		connection.close();
	}
}
