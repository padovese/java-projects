package academy.learnprogramming;

public class EqualityOperators {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        boolean c = a == b;
        boolean d = a != b;

        boolean x = true;
        boolean y = false;
        boolean z = (y = true) && (x = false);

        System.out.println("x= " + x + ", y= " + y + ", z= " + z);
    }
}
