package refatoracao4;

public class ContaPf extends ContaBancaria {

	public ContaPf(String titular, double saldoInicial) {
		super(saldoInicial, titular);
	}

	@Override
	public void saca(double valor) {
		this.saca(valor - 0.01);
	}

	@Override
	public void deposita(double valor) {
		this.deposita(valor + 0.1);
	}

}
