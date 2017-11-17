
public class TesteDeDescontos {

	public static void main(String[] args) {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();

		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("Mesa", 500));
		orcamento.adicionaItem(new Item("Cadeira", 50));

		System.out.println(new CalculadorDeDescontos().calcula(orcamento));
	}
}
