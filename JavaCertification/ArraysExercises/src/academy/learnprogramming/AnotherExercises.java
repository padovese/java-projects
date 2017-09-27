package academy.learnprogramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnotherExercises {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 4, -1, 5);
        Collections.sort(list);
        Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array[0]);

        String[] name = {"Tommy", "Mike", "Anthony"};
        List<String> list2 = Arrays.asList(name);
        list2.set(0, "Tom");
        System.out.println(list2);

        Integer.parseInt("2");
        Integer.valueOf("2");
    }
}
