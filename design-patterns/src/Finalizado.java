
public class Finalizado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos finalizados nao recebem descontos!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja finalizado.");
	}

	@Override
	public void reporova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja finalizado.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja finalizado.");
	}

}
