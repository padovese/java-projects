import java.util.Scanner;

public class FindSmallestNumber {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Type the first value: ");
		double x = in.nextDouble();
		System.out.print("Type the second value: ");
		double y = in.nextDouble();
		System.out.print("Type the third value: ");
		double z = in.nextDouble();
		in.close();
		System.out.println("The smallest value is: " + findSmallest(x, y, z));
		
	}
		
	public static double findSmallest(double x, double y, double z){
		return Math.min(Math.min(x, y), z);
	}
		
	

}
