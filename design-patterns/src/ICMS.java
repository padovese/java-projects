
public class ICMS extends Imposto {

	public ICMS() {
		
	}
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public double calcula(Orcamento orcamento) {
		double icms = orcamento.getValor() * 0.1 + calculoDoOutroImposto(orcamento);
		return icms;
	}
}
