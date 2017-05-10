package programa;

import modelo.Conta;
import modelo.GuardadorDeObjetos;
import modelo.Cliente;

public class TestaJavaLang {

	public static void main(String[] args){

		boolean flag;
		int len;
		
		String curso = "fj11";
		curso = curso.replace("j", "k");
		curso = curso.concat(" Padovese");
		flag = curso.startsWith("afk");
		len = curso.length();
		curso = curso.toUpperCase();
		
		System.out.println(curso);

		if(flag){
		System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		System.out.println(len);
		
		double pi = 3.14;
		
		System.out.println(Math.round(pi));
		
		
		int[] vetor = new int[4];
		vetor[0] = 99;
		
		for(int i = 0; i < vetor.length; i++){
			if(i > vetor.length){
				throw new IndexOutOfBoundsException();
			}
			vetor[i] = vetor[i] + 1;
			System.out.println(vetor[i]);
		}
	}
}
