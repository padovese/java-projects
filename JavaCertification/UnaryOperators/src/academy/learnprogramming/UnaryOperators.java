package academy.learnprogramming;

public class UnaryOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a == b);

        int x = 3;

        boolean c = (0 != 0);
        System.out.println(c);


        int e = 3;
        int f = ++e * 5 / e-- + --e;

        //4 * 5 / e-- + --e
        //4 * 5 / 4 + --e
        //4 * 5 / 4 + 2
        //20 / 4 + 2
        //5 + 2
        //7
        System.out.println("e= " + e + " f= " + f);

        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 + 2 * g++ - h-- % --g;

        //3 + 5 * 3 + 2 * g++ - h-- % --g
        //3 + 5 * 3 + 2 * 5 - 3 % --g -> g = 6   h = 2
        //3 + 5 * 3 + 2 * 5 - 3 % 5   -> g = 5   h = 2
        //3 + 15 + 10 - 3
        // 28
        System.out.println(i);

        System.out.println(3%5);
    }
}

