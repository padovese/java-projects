import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private LocalDate data;
	private List<AcaoAposGerarNota> todasAcoesASeremExecutas;
	
	public NotaFiscalBuilder() {
		this.todasAcoesASeremExecutas = new ArrayList<AcaoAposGerarNota>();
	}
	
	public void adicionaAcao(AcaoAposGerarNota acao) {
		this.todasAcoesASeremExecutas.add(acao);
	}
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscalBuilder naDataAtual() {
		this.data = LocalDate.now();
		return this;
	}
	
	public NotaFiscal constroi() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
		
		for(AcaoAposGerarNota acao : todasAcoesASeremExecutas) {
			acao.executa(nf);
		}
		
		return nf;
	}
}