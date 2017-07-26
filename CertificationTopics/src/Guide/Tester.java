package Guide;

import java.util.ArrayList;
import java.util.Arrays;

//The calc is 2¹. 1 means the number of bits.
//boolean true or false			//Total of 1 bit
//byte 	-128 to 127 			//Total of 8 bits
//short -32768 to 32767			//Total of 16 bits
//int 	-2147483648 to ...		//Total of 32 bits
//long	-9223372036854775808L	//Total of 64 bits
//float	 ex: 123.45f			//Total of 32 bits
//double ex: 123.45				//Total of 64 bits
//char	 ex: 'a'				//Total of 16 bits

public class Tester {
	
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Um");
		lista.add("Dois");
		lista.add("Um");
		
		System.out.println(lista);
		
		System.out.println(lista.remove("Um"));
		
		System.out.println(lista);
		
		lista.clear();
		System.out.println(lista.isEmpty());
		System.out.println(lista.size());
	}
}

