package modelo;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

public class TestaGastosTest {

	@Test
	public void test() {
		ArrayList<Integer> o = new ArrayList<>();
		o.add(0);
		o.add(1);

		assertTrue("A lista está vazia", !o.isEmpty());
	}

	@Test
	public void secondTest() {
		int a = 1;

		assertTrue("Retorno falso", a == 0);

	}

	@Test
	public void thirdTest() {
		Funcionario f = new Funcionario("Padovese", 681962, LocalDate.of(1991, 04, 26));
		Gasto g = new Gasto(1, "Taxi", f, LocalDate.now());

		boolean result = g.getData().equals(LocalDate.now());

		assertTrue("Retorno falso", result);

	}

}
