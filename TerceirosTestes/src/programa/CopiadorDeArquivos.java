package programa;

public class CopiadorDeArquivos implements Runnable{
	public void run(){
		for(int i = 0; i < 10000; i++){
			System.out.println("Est� copiando o " +  i + "� arquivo.");
		}
	}
}
