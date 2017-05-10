package programa;
import modelo.Gerente;
import modelo.TotalizadorDeBonus;

class TestaFuncionario {
	public static void main(String[] args){
		
		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000.0);
		joaquim.cobraEntrega();
		
		System.out.println(joaquim.getBonus());
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		
		totalizador.adiciona(joaquim);
		
		System.out.println(totalizador.getTotal());
	}
}