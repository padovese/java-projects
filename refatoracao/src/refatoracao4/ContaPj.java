package refatoracao4;

public class ContaPj extends ContaBancaria {

	public ContaPj(String titular, double saldoInicial) {
		super(saldoInicial, titular);
	}

	@Override
	public void saca(double valor) {
		super.saca(valor + 0.2);
	}

	@Override
	public void deposita(double valor) {
		super.deposita(valor - 0.2);
	}

}
