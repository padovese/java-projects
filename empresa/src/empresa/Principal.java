package empresa;

import java.time.LocalDate;

import modelo.Funcionario;

public class Principal {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Padovese", 684962, LocalDate.of(1991, 04, 26));

		System.out.println(funcionario);
	}
}
