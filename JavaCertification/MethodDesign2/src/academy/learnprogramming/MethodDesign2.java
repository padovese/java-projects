package academy.learnprogramming;

public class MethodDesign2 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(media(1, 6, 9, 7, 8, 5));
    }

    static double media(int... x) {
        double a = 0;
        for (int b : x) a += b;
        System.out.println(x[2]);
        return a / x.length;
    }
}
