package academy.learnprogramming;

import java.util.ArrayList;

public class FinalVariables {

    public static final int SIZE = 10;

    private static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        int[] array = new int[SIZE];

        System.out.println(array.length);

        list.add("one");
        list.add("two");
        list.add("three");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
