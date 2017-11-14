
public class ICMS implements Imposto {

	public double calcula(Orcamento orcamento) {
		double icms = orcamento.getValor() * 0.1;
		return icms;
	}
}
