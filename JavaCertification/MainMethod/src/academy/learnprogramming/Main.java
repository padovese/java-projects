package academy.learnprogramming;
public class Main {

    public static void main(String[] args) {
        //printing size of arguments
        System.out.println("args-size= " + args.length);

        for(int i = 0; i < args.length; i++){
            System.out.println("args[" + i + "]=" + args[i]);



        }
    }

    public static int sum(int a, int b){
        return a+b;
    }

}
