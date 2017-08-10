package area;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestTxt {
	public static void main(String[] args) throws FileNotFoundException {
		
		
		PrintStream ps = new PrintStream("padova.txt");
		
		for(int i = 0; i < 10; i++){
			ps.println(i);	
		}
		
		
		ps.close();
	}

}
