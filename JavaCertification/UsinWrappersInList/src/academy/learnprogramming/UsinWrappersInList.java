package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class UsinWrappersInList {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();

        list.add(10.5); //autoboxing
        list.add(new Double(55.10));
        list.add(Double.valueOf(99.9));

        list.remove(55.10); //autoboxing

        double getList = list.get(0); //unboxing

        System.out.println(getList);

        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list2.add(null);

        //list2.remove(0);
//        int a = list2.get(0);

        List<Character> c = new ArrayList<>();
        c.add('L');

        //c.remove(new Character('L')); this works fine
        c.remove(Character.valueOf('L')); //this works the same

        System.out.println(c);
    }
}
