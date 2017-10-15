package academy.learnprogramming;

public class CheckedVsUnchecked {
    public static void main(String[] args) {
//        myMethod();
        myMethod2();
    }

    public static void myMethod() throws Exception{
        throw new Exception("Failed to do what was expected.");
    }

    public static void myMethod2() throws RuntimeException{
        throw new RuntimeException("Wrong arguments.");
    }
}
