class Programa1{

	public static void main ( String[] args){
		
		int idadeJoao = 18;
		int idadeMaria;
		idadeMaria = 21;
		
		int somaDasIdades = idadeJoao + idadeMaria;
		
		double pi = 3.1415;
	
		System.out.println(somaDasIdades);
		System.out.println(pi);
		
		boolean amigo = true;
		boolean inimigo = !amigo;
		
		boolean maiorDeIdade = idadeJoao <= 18;
		
		char letra = 'M';
		String nomeCompleto = "João da Silva";
		
		long numeroGrande = 9999999999L;
		
		float outroPi = 3.14;
		
		//Conversão explicita
		
		long numero = 314;
		int copiaDeNumero = (int) numero;
		
		double grande = 10.8;
		float copia = (double) grande;
		
	}

}