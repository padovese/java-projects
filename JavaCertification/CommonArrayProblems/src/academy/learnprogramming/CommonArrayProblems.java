package academy.learnprogramming;

public class CommonArrayProblems {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 1; i < numbers.length; i++) {
            System.out.println(i + " " + numbers[i]);
        }

        for (int i = 1; i <= numbers.length - 1; i++){
            System.out.println(i + " " + numbers[i]);
        }

//        int[20] numbs; //does not compile
        int[] nums = new int[20];

//        int size = nums.length(); //does not compile, lenght is not a method from array
        int size = nums.length;

        //nums.length = 10; //does not compile, size can be set only in inicialization
    }
}
