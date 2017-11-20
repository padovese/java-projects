
public interface TesteAcoes {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new NotaFiscalDAO());
		builder.adicionaAcao(new EnviadorDeSms());
		builder.adicionaAcao(new Impressora());
		
		NotaFiscal nf = builder.paraEmpresa("Company x")
				.comCnpj("123")
				.comItem(new ItemDaNota("Nome do item", 100))
				.comObservacoes("obs")
				.naDataAtual()
				.constroi();
		
		System.out.println(nf.getValorBruto());
	}
}
