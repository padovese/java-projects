package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hornet");
        list.add("Cj6");
        list.add("Teneré");

        //Converting list to array
        Object[] myArray = list.toArray();      //This converts as objects
        System.out.println(myArray.length);

        String[] myArrayOfStrings = list.toArray(new String[0]);        //this convert as the same type

        String[] myOtherArrayOfStrings = list.toArray(new String[list.size()]);

        //Converting array to list
        String[] petArray = {"dog", "cat", "parrot"};
        List<String> petList = Arrays.asList(petArray);
//        List<String> petList2 = Arrays.asList("dog", "cat", "parrot"); //can be done this way too

        System.out.println(petList.size());

        petList.set(0, "bird");
        petArray[1] = "fish";
        System.out.println(Arrays.toString(petArray));
        System.out.println(petList);

        //petList.add("dino");  //you can't change the size of a list, if it is associated with an Array, it's an Array and a List poiting to the same reference.
//        petList.remove(0);

        List<String> list3 = Arrays.asList("a", "b", "c");
//        list3.add("d");  //doesn't work as well. Any list created using asList is not able to change its size
    }
}
