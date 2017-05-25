import java.util.Scanner;

public class FindCharacter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("The the word: ");
		String x = in.nextLine();
		in.close();
		System.out.println("The middle characters: " + findMiddleChar(x));
	}

	public static String findMiddleChar(String x) {
		int y = x.length()/2;
		if(x.length()%2 == 0){
			return x.substring(y-1, y+1);
		} else{
			return x.substring(y, y+1);
		}
	}
}
