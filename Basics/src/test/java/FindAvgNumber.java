import java.util.Scanner;

public class FindAvgNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type the first number: ");
		double x = in.nextDouble();
		System.out.print("Type the second number: ");
		double y = in.nextDouble();
		System.out.print("Type the third number: ");
		double z = in.nextDouble();
		in.close();
		System.out.println("The average of the three numbers is: " + findAvg(x, y, z));
	}

	public static double findAvg(double x, double y, double z) {
		return (x+y+z)/3;
	}
}
