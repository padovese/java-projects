
public class DescontoPorCincoItens {
	public double desconto(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		} else {
			return 0;
		}
	}
}
