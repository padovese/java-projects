package refatoracao;

public class NfDAO {
	public void salvaNoBanco() {
		// salva no banco
		String sql = "insert into notafiscal (cliente, valor)" + "values (?," + 2.0 + ")";

		System.out.println("Salvando no banco" + sql);
	}
}
