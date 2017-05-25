import java.util.Scanner;

public class CalcInvestment {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type the amount: ");
		double x = in.nextDouble();
		System.out.print("Type the rate of interest: ");
		double y = in.nextDouble();
		System.out.print("Type the years: ");
		double z = in.nextDouble();
		in.close();
		System.out.println("Years   FutureValue");
		for(int i = 1; i <= z; i++){
			System.out.println(i + "        " + Calc(x,y,z));
			x = Calc(x,y,z);
		}
	}

	public static double Calc(double x, double y, double z) {
			return x + ((x*100) / y);
		}
		
}
