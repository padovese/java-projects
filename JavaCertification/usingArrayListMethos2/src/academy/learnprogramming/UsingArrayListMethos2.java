package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethos2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println(list.isEmpty());
        System.out.println(list.size());

        if(list.isEmpty())
            System.out.println("no pets.");

        if(list.size() == 0)
            System.out.println("no pets.");

        list.add(12);
        System.out.println(list.isEmpty());
        System.out.println(list.size());


        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        list.add(123);
        System.out.println(list.contains(1234));
        System.out.println(list.contains(123));

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(123);

        System.out.println(list.equals(list2));

        list.add(456);
        System.out.println(list.equals(list2));

        List<Double> list3 = new ArrayList<>();
        List<Float> list4 = new ArrayList<>();
        List<Short> list5 = new ArrayList<>();
        List<Byte> list6 = new ArrayList<>();
        List<Character> list7 = new ArrayList<>();
        List<Long> list8 = new ArrayList<Long>();
    }
}
