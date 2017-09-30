package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class StaticInicialization {
    private static final int SIZE;

    public static int one;
    public static final int two;
    public static final int three = 3;

    public static final List<String> NAMES = new ArrayList<>();

//    public static final int four;
static {
    System.out.println("First static init");
    int rows = 5;
    int columns = 5;
    SIZE = rows * columns;
}

     static{
        System.out.println("Second static init");
        one = 1;
        two = 2;
        one = three;
        one = 2;
        one = three;
    }


    static{
        System.out.println("Third static init");
        NAMES.add("Jimmy");
        NAMES.add("Timmy");
    }

    public static void main(String[] args) {
        System.out.println(NAMES);
    }
}
