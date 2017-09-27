package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();

        l.add("1");
        l.add(1);
        l.add(1L);
        l.add(1.0F);

        System.out.println(l);

        l.size();

        ArrayList l2 = new ArrayList();

        l2.add("1");
        l2.add(1);
        l2.add(1L);
        l2.add(1.0F);
        l2.add(1, 9);

        System.out.println(l2);

        System.out.println(l == l2);
        System.out.println(l.equals(l2));

        int[] array = {1, 2};
        int[] array2 = {1, 2};


        System.out.println(array == array2);
        System.out.println(array.equals(array2));
    }
}
