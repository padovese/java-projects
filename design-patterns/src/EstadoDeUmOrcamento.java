
public interface EstadoDeUmOrcamento {
	void aplicaDescontoExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	void reporova(Orcamento orcamento);
	void finaliza (Orcamento orcamento);
}
