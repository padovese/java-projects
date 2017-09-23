package academy.learnprogramming;

public class StringConcatenation {
    public static void main(String[] args) {
        int b = 2;
        int c = 5;
        System.out.println("a" + b + c);

        String str = "";
        for (int i = 0; i < 10; i++){
            str += i;
        }
        System.out.println(str);


    }
}
