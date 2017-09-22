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

    }
}
