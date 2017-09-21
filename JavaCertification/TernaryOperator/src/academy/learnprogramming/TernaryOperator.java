package academy.learnprogramming;

public class TernaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y;

        if(x > 5) y = 2 * x;
        else y = 4 * x;

        System.out.println(y);

        y = x > 5 ? 2 * x : 4 * x;
        y = (x > 5) ? (2 * x) : (4 * x);

        System.out.println(y);

        y = 1;
        System.out.println(y > 5 ? 10 : "test");

        int a = 1;
        int b = 1;
        int c = a < 10 ? a++ : b++;

        System.out.println("a= " + a + " b= " + b + " c= " + c);

        int e = 1;
        int f = 2;
        int g = 3;

        if(e < 10){
            f = e++ < 1 ? e++ : f++;
        } else{
            f = (e + f) < 2 ? e++ : f++;
        }

        System.out.println("e= " + e + " f= " + f + " g= " + g);
    }
}
