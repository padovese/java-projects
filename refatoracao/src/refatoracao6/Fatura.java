package refatoracao6;

import static refatoracao6.Moeda.DOLAR;

public class Fatura {

	private double valorMensal;
	private String cliente;

	public Fatura() {

	}

	public Fatura(double valorMensal, String cliente) {
		super();
		this.valorMensal = valorMensal;
		this.cliente = cliente;
	}

	public double getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double emDolar() {
		return valorMensal * DOLAR.getTaxa();
	}

}
