package academy.learnprogramming;

public class CompoundAssignmentOperators {
    static int a;
    public static void main(String[] args) {
        System.out.println(a);

        int a = 5;
        long b = 2;

        //a = a / b; //doesnt work because it convert the result to long

        a /= b;
        System.out.println(a);


        int c = 5;
        long d = 2;

        c %= d;

        System.out.println(c);

        long e = 3;
        long f = 2;
        long h = 1;

        long i = e + 3 * (f = 3) - (h -= 2);
        // 3 + 3 * 3 - -1
        // 9+3
        //12
        System.out.println(i);

    }
}
