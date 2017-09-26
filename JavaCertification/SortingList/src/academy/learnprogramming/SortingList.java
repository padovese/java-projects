package academy.learnprogramming;

import java.util.*;

public class SortingList {
    public static void main(String[] args) {
        int[] myArray = new int[0];
        Arrays.sort(myArray);

        List<String> myList = new ArrayList<String>();
        myList.add("500");
        myList.add("10");
        myList.add("9");
        myList.add("50");
        myList.add("40");

        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);

        List<Integer> list = new ArrayList<>(Arrays.asList(1,456,48,9,4,2,31,1)); //This way you can change the size, because it
        System.out.println(list);
        list.add(7);
        System.out.println(list);

        List<Integer> list2 = Arrays.asList(1,456,48,9,4,2,31,1);
        Collections.sort(list2);

        System.out.println(list2);
    }
}
