package programa;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestaData {
	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();		
		
		System.out.println(dateFormat.format(date));
	}
	

	
}