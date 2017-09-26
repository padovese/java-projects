package academy.learnprogramming;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; ) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (; ; ) {
            System.out.println("lol");
            break;
        }

        int i = 0;

        for (; i < 10; ) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        int j = 0;
        for (; ; j++) {
            System.out.print(j + " ");
            break;
        }

        for (int z = 1; z < 2; z++)
            System.out.println(z);


        for (long b = 0; b < 5; b++)
            for (byte m = 0; m < 5; m++)
                System.out.println(b + " * " + m + " = " + (b * m));
        System.out.println("hello");

        int[] p = new int[]{1, 2, 3};
        int a = 120;
        switch (a) {
            default:
                System.out.println(1);
            case 20:
                for(int x : p) System.out.println(x);
            case 10+11:
                System.out.println(2);
                break;
        }

    }
}
