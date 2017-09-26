package academy.learnprogramming;

import java.util.*;

public class IteratingList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(6);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + "= " + list.get(i));
        }

        for (Integer number : list) {
            System.out.println("numbers= " + number);
//            list.remove(2); throws exception -> current modification
        }

        for(Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ){
            Integer number = iterator.next();
            System.out.println(number);
            iterator.remove();
        }

        System.out.println(list);

        list.addAll(Arrays.asList(1,4,6,8,9,5));

        for(ListIterator<Integer> listIterator = list.listIterator(4); listIterator.hasPrevious();){
            System.out.println(listIterator.previous());
            listIterator.remove();
        }
    }
}
