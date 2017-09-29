package academy.learnprogramming;

public class Static {

    String name = "Padovese";

    static void method1(){}
    static void method2(){}

    static void method3(){
        method1();
        method2();
        //name;
        //main();
    }

    public void main(){
        name = "1";
        method2();
        main();
    }

    public static void main(String[] args) {
        method1();
        Static.method1();
    }

}
