import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class TestaData{
	public static void main(String[] args) throws ParseException{  
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "31-08-1982 10:20:56";
		Date date = sdf.parse(dateInString);
		System.out.println(date);
	}
}