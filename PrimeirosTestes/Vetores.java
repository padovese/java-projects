class Vetores{
	public static void main(String[] args){
		
		//int[] valores;
		//valores = new int[10];
		int[] valores = new int[10];
		valores[5] = 10;
		
		System.out.println(valores[5]);
		
		//Array de classes
		
		Funcionario[] meusFuncionarios = new Funcionario[10];
		
		Funcionario f1 = new Funcionario();
		f1.nome = "Padovese";
		f1.departamento = "T.I.";
		f1.salario = 5133.0;
		f1.rg = "37.912.522-5";
		
		meusFuncionarios[0] = f1;
		
		meusFuncionarios[1] = new Funcionario();
		meusFuncionarios[1].nome = "Doguinho";
		
		System.out.println(meusFuncionarios[0].nome + "\n" + meusFuncionarios[1].nome);
		
		//Percorrendo array
		for (int i = 0; i < 10; i++){
			valores[i] = i*10;
		}
		for (int i = 0; i < 10; i++){
			System.out.println(valores[i]);
		}
		
		for (int x : valores){
			System.out.println(x);
		}
		
		for(String argumento : args){
			System.out.println(argumento);
		}
		
		
	}
	
}