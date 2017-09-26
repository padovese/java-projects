package academy.learnprogramming;

import java.util.*;

public class SearchingArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("500");
        list.add("10");
        list.add("9");
        list.add("50");
        list.add("40");

        System.out.println(list);


        int index = Collections.binarySearch(list, "10");
        System.out.println(index);

        Collections.sort(list);
        index = Collections.binarySearch(list, "10");
        System.out.println(index);

        List<Integer> list2 = Arrays.asList(1, 25, 6, 77, 4, 6, 9, 0, 4);
        System.out.println(list2);

        int index2 = Collections.binarySearch(list2, 6);
        System.out.println(index2);

        Collections.sort(list2);
        index2 = Collections.binarySearch(list2, 6);
        System.out.println(index2);
    }
}
