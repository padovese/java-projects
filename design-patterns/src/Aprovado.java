
public class Aprovado implements EstadoDeUmOrcamento{
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.02;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja aprovado");
	}

	@Override
	public void reporova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja aprovado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}
}
 