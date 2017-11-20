package modelo;

import java.time.LocalDate;

public class TestaGastos {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("Padovese", 681962, LocalDate.of(1991, 04, 26));

		Gasto g = gastoBuilder(f);
		Gasto gDois = new Gasto(10, "Taxi", f, LocalDate.now());
		Gasto g3 = new Gasto(30, "Taxi", f, LocalDate.now());

		System.out.println(g);
		System.out.println(gDois);
		System.out.println(g3);

	}

	private static Gasto gastoBuilder(Funcionario f) {
		Gasto g = new Gasto(40, "Taxi", f, LocalDate.now());
		return g;
	}
	
	}
