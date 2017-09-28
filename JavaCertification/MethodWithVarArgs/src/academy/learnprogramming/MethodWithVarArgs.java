package academy.learnprogramming;

public class MethodWithVarArgs {
    public static void main(String[] args) {
        method(1, new int[0]);
    }

    public static void method(int a, int... x){
        System.out.println("a= " + "x= " + x.length);
    }
}
