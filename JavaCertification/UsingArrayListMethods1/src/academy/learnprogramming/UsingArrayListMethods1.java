package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethods1 {
    public static void main(String[] args) {
        //    List list = new ArrayList();
        List<Object> list = new ArrayList<>(); //it's the same as the line above
        list.add("dog");
        list.add(5);

        System.out.println(list); //Same as Arrays.toString() or list.toString()

        List<String> pets = new ArrayList<>();
        pets.add("dog");
        System.out.println(pets);

        pets.add(0, "cat");
        System.out.println(pets);

//        pets.add(5);//does not compile

        pets.add(1, "parrot");
        pets.add(0, "husky");
        pets.add(1, "bird");
        System.out.println(pets);

        pets.remove("parrot");
        System.out.println(pets);

        pets.remove(2);
        System.out.println(pets);

        //in array we used to do pets[0] = "newBird";
        pets.set(0, "newBird");
        System.out.println(pets);

//        pets.set(8, "newBird"); //throws indexoutofbounds exception

        List<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(1);
        num.add(0);
        num.remove(Integer.valueOf(0));
        System.out.println(num);
    }
}
