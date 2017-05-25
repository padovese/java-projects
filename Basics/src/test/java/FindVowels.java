import java.util.Scanner;

public class FindVowels {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type the word: ");
		String x = in.nextLine();
		in.close();
		System.out.println("Number of vowels: " + countVowels(x));
	}

	public static int countVowels(String x) {
		return (int) (x.chars().filter(num -> num == 'a').count() +
				x.chars().filter(num -> num == 'e').count() +
				x.chars().filter(num -> num == 'i').count() +
				x.chars().filter(num -> num == 'o').count() +
				x.chars().filter(num -> num == 'u').count());
	}
}

