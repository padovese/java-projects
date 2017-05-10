package programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestaJavaIO {
	
	public static void main(String[] args) throws IOException{
		InputStream is = new FileInputStream("leitura.txt"); //Lê os bytes //pode-se usar system.in para pegar do console
		InputStreamReader isr = new InputStreamReader(is);   //Lê os caracteres do txt
		BufferedReader br = new BufferedReader(isr);		 //Cria buffer para ler strings inteiras
		
		OutputStream os = new FileOutputStream("saida.txt"); //Pode se usar aqui system.out para saida no console
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		String linha = br.readLine();
		//Para ler o arquivo todo é necessário este laço. Sem ele apenas a primeira linha é impressa.
		while(linha != null){
			bw.append(linha);
			bw.newLine();
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
	}
	
}
