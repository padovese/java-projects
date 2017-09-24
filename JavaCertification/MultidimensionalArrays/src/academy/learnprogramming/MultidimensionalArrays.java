package academy.learnprogramming;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        //1D array
//        int[] myArray = new int[2];
//        int[] myArray = new int[]{1, 2};
        int[] myArray = {1, 2};

        //2D array
        int[][] My2dArray = new int[4][2];
//        int my2dArray[][] = new int[4][2];
//        int[] My2dArray[] = new int[4][2];

        String[][] another2dArray = new String[][]{
                {"Bruno"},
                {"Bruno", "Henrique", "Santana", "Padovese"},
                {"Bruno", "Padovese"},
                null
        };

        System.out.println(Arrays.toString(another2dArray));

        int[][] num = new int[2][3];
        num[0][0] = 1;
        num[0][1] = 2;
        num[0][2] = 3;
//        num[0][3] = 4;  //thows an exception

        //3d array
        int[][][] threeArray = new int[3][3][3];
        threeArray[0][0][0] = 1;

        //int[][] threeArray[] = new int[3][3][3];

        int[][][] threeDArray = {
                {{1, 2}, {3, 4}, {5, 6}},
                {{1, 2}, {3, 4}, {5, 6, 7}, {7, 8}},
                {{1, 2}}
        };

        System.out.println(threeDArray.length);


    }
}
