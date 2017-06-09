package DAO.loja;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Funcionarios;

public class FuncionariosDAO {
	private final Connection conn;

	public FuncionariosDAO(Connection conn) {
		this.conn = conn;
	}
	
	public void Salva(Funcionarios func) throws SQLException{	
		String sql = "insert into funci values (seq_funci.nextval, ?, ?)";
		
		try(PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setString(1, func.getNome());
			stmt.setString(2, func.getNacionalidade());
			stmt.execute();
			System.out.println("Funcionário inserido com sucesso.");
		}
	}
	
	public List<Funcionarios> listaFuncionarios() throws SQLException{
		List<Funcionarios> funcionarios = new ArrayList<>();
		String sql = "select * from funci";
		
		try(PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.execute();
			
			try(ResultSet rs = stmt.getResultSet()){
				while(rs.next()){
					String nome = rs.getString("nome");
					String nacionalidade = rs.getString("nacionalidade");
					Funcionarios funcionario = new Funcionarios(nome, nacionalidade);
					funcionarios.add(funcionario);
				}
			}
		}
		return funcionarios;
	}
}