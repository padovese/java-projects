package academy.learnprogramming;

import java.util.Arrays;

public class UsingArrays {
    public static void main(String[] args) {
        String[] pets = {"parrot", "dog", "cat"};

        System.out.println(pets[0]);
        System.out.println(pets[1]);
        System.out.println(pets[2]);
//        System.out.println(pets[3]); //Throws ArrayIndexOutOfBounds

        pets[0] = "fish";
        for(int i = 0; i < pets.length ; i++)
            System.out.println(pets[i]);


        double[] nums = new double[5];
        System.out.println(Arrays.toString(nums));
        String[] newPets = new String[5];
        System.out.println(Arrays.toString(newPets));

        for(int i = 0; i <= nums.length - 1; i++){
            nums[i] = 10 + i;
        }

        for(int i = 0; i < nums.length; i++){
            System.out.println("nums[" + i + "]= " + nums[i]);
        }

        Integer[] nums2 = new Integer[5];
        System.out.println(Arrays.toString(nums2));
        for(int i = 0; i < nums2.length; i++){
            nums2[i] = i%3;
            System.out.println(nums2[i]);
        }
    }
}
