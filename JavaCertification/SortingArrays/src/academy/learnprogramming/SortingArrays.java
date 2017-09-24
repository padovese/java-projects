package academy.learnprogramming;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 2};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        String[] words = {"50", "96", "500", "Padovese"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        int a = 0b101;
        int b = 0xAB09F;

        System.out.println(a + " " + b);
    }
}
