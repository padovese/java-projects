package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        ArrayList<Object> myList2 = new ArrayList<Object>();

        ArrayList<String> myList3 = new ArrayList<String>();
        ArrayList<String> myList4 = new ArrayList<>(); // it's the same

        //implementing using polymorphism
        List mylist5 = new ArrayList<>();
        List<String> mylist6 = new ArrayList<>();

        List<String> myList7 = new ArrayList<>(20); //it will increase automatically
    }
}
