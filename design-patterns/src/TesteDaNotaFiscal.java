import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class TesteDaNotaFiscal {
	
	public static void main(String[] args) {
//		List<ItemDaNota> itens = Arrays.asList(new ItemDaNota("item 1", 200.0), new ItemDaNota("item 2", 400.0));
//		
//		double valorTotal = 0;
//		for(ItemDaNota item : itens) {
//			valorTotal += item.getValor();
//		}
//		
//		double impostos = valorTotal * 0.05;
//		
//		NotaFiscal notaFiscal = new NotaFiscal("razao social", "404664496", LocalDate.of(2017, 04, 26), valorTotal, impostos, itens, "observacoes");
		CriadorDeNotaFiscal criadorDeNotaFiscal = new CriadorDeNotaFiscal();
	}
}
