package academy.learnprogramming;

public class DealingWithExcpetions {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            double result = divide(a, b);
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("there is an error in the code.");
            e.printStackTrace();
        }
    }

    private static double divide(int a, int b) {
        return a / b;
    }
}
