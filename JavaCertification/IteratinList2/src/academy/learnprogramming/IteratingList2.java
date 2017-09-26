package academy.learnprogramming;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList2 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(createArray());


        //for loop
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < list.size(); i++){
            String temp = list.get(i);
        }

        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("for loop total time " + totalTime + " ms");

        //for each loop
        startTime = System.currentTimeMillis();

        for(String temp : list){}

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("for each loop time " + totalTime + " ms" );

        //iterator      //Iterator and ListIterator are useful when you have to modify your list while looping it, like a ref cursor
        startTime = System.currentTimeMillis();

        for(Iterator<String> iterator = list.iterator(); iterator.hasNext(); ){
            String temp = iterator.next();
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("iterator time " + totalTime + " ms" );


        //listIterator
        startTime = System.currentTimeMillis();

        for(ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext();){
            String temp = listIterator.next();
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("listIterator time " + totalTime + " ms" );

    }

    private static String[] createArray(){
        String[] myArray = new String[10_000_000];

        for(int i = 0; i < myArray.length; i++){
            myArray[i] = "Array " + i;
        }

        return myArray;
    }
}
