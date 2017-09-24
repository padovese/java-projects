package academy.learnprogramming;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String... args) {
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));

        print(args);
        print("a", "b", "c");
        print2("a", "b", "c");
    }

    public static void print(String... arguments){
        System.out.println(arguments.length);
        System.out.println(Arrays.toString(arguments));
    }

    public static void print2(String a, String... arguments){
        System.out.println(a);
        System.out.println(arguments.length);
        System.out.println(Arrays.toString(arguments));
    }
}
