class Programa2{
	
	public static void main ( String[] args){
		
		int idadeVisitante = 69;
		boolean amigoDoDono = true;
		
		
		if(idadeVisitante > 60){
			System.out.println("Aproveite a melhor idade");
		} else if(idadeVisitante >= 18 || amigoDoDono){
			System.out.println("Entra na festa!");
		} else{
			System.out.println("Volte pra casa!");
		}
		
	}
}