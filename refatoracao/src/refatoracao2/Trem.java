package refatoracao2;

import java.util.List;

public class Trem {

	private List<Vagao> vagoes;
	private int capacidade;

	public boolean podeReservar(int lugaresAReservas) {
		int lugaresDisponiveis = capacidade - lugaresJaResevados();
		return lugaresDisponiveis > lugaresAReservas;
	}

	private int lugaresJaResevados() {
		int lugaresJaResevados = 0;
		for (Vagao vagao : vagoes) {
			lugaresJaResevados += vagao.reservados();
		}
		return lugaresJaResevados;
	}

}
