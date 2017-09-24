package academy.learnprogramming;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        int[] myArray2 = new int[]{10, 12, 15};
        int[] myArray3 = new int[0];
        int[] myArray4 = {};

        int[][] a = {{1, 2}, {4, 5}};

        String[] animals = {"Parrot", "dog", "cat"};
        String[] myAnimals = animals;
        String[] anotherAnimals = {"Parrot", "dog", "cat"};

        System.out.println(animals.equals(myAnimals));
        System.out.println(animals == myAnimals);
        System.out.println(Arrays.equals(animals, myAnimals));

        System.out.println(animals.equals(anotherAnimals));
        System.out.println(animals == anotherAnimals);
        System.out.println(Arrays.equals(animals, anotherAnimals));

        System.out.println(animals);
        System.out.println(animals.toString());
        System.out.println(Arrays.toString(animals]));
    }
}
