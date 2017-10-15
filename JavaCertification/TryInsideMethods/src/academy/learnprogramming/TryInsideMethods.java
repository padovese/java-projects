package academy.learnprogramming;

public class TryInsideMethods {
    public static void main(String[] args) {
        System.out.println(calculate());
    }

    public static int calculate(){
        try{
            return 10 / 1;
        } catch (ArithmeticException a){
            System.out.println("Artihmetc catched");
            return 1;
        } finally {
            System.out.println("end;");
            System.exit(0);
            return 2;
        }
    }
}
