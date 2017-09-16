package academy.learnprogramming;

import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;

import static academy.learnprogramming.Config.*;

public class StaticImportExample {

    public static void main(String[] args) {
        int min = min(5,7);
        out.println("min= " + min);
        out.println(PI);

        System.out.println(NAME);
        System.out.println(MAX_COLUMN_COUNT);
        printConfig();

    }
}
