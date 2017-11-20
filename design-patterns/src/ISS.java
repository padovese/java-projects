
public class ISS extends Imposto {

	public ISS() {
		
	}
	
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		double iss = orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
		return iss;
	}
}
