package refatoracao3;

public class GeradorDeNotaFiscal {

	public Object gera(Object fatura) {

		double nf = geraNf();
		new NfDAO().salvaNoBanco();
		new EnviadorDeEmail().enviaEmail();

		return nf;
	}

	private double geraNf() {
		// calcula valor do imposto
		double valor = 1.0;// fatura.getValorMensal();
		double imposto = 0;
		if (valor < 200) {
			imposto = valor * 0.03;
		} else if (valor > 200 && valor <= 1000) {
			imposto = valor * 0.06;
		} else {
			imposto = valor * 0.07;
		}
		double nf = valor - imposto;
		return nf;
	}
}
