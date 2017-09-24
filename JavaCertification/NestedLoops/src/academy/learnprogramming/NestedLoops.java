package academy.learnprogramming;

public class NestedLoops {
    public static void main(String[] args) {
        for (int hours = 1; hours <= 6; hours++) {
            for (int minutes = 0; minutes < 60; minutes++) {
            //    System.out.println(hours + ":" + minutes);
            }
        }

        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6, 66},
                {7, 8, 9}};

        for(int i = 0; i < myArray.length; i++){
            for (int j = 0; j < myArray.length; j++){
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        OUTER:
        for(int[] rowArray : myArray){
            INNER:
            for(int i = 0; i < rowArray.length; i++){
                System.out.print(rowArray[i] + " ");
            }
            System.out.println();
        }

        System.out.println();
        OUTER:
        for(int[] rowArray : myArray){
            INNER:
            for(int i = 0; i < rowArray.length; i++){
                if(rowArray[i] % 2 == 0){
                    //break INNER;
                    continue INNER;
                }
                System.out.print(rowArray[i] + " ");
            }
            System.out.println();
        }

        //pay attention, do always make 1 intration.
        int x = 10;
        while(x > 0){
            do{
                x -= 1;
            } while(x > 5);

            x--;
            System.out.println(x);
        }
    }
}
