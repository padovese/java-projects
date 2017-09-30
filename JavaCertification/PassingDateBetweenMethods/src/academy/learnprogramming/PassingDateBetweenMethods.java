package academy.learnprogramming;

public class PassingDateBetweenMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder().append("abc");
        System.out.println(sb);
        method(sb);

        System.out.println(PassingDateBetweenMethods.method2());
    }

    public static void method(StringBuilder sb){
        System.out.println(sb);
    }

    public static Integer method2(){return 1;}
}
