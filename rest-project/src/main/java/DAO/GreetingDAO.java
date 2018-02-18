package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hello.Greeting;

public class GreetingDAO {
	private final Connection con;

	public GreetingDAO(Connection con) {
		this.con = con;
	}

	public List<Greeting> lista(int p_id) throws SQLException {
		if(p_id == 0) {
			p_id = 1;
		}
		
		List<Greeting> greetings = new ArrayList<>();

		String sql = "select * from content where id = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, p_id);
			stmt.execute();

			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String content = rs.getString("value");
					Greeting greeting = new Greeting(id, content);
					greetings.add(greeting);
				}
			}
		}
		return greetings;
	}
}

