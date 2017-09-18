package academy.learnprogramming;

public class AssingmentOperators {
    public static void main(String[] args) {
        //Byte goes from -128 to 127
        byte a = 127;
        byte b = (byte)(a + 1);

        System.out.println(b); //Overflow

        byte c = -128;
        c--;

        System.out.println(c); //Underflow

        overFlow();
    }

    public static void overFlow(){
        int a = 0;
        a++;
        System.out.println(a);
        overFlow();
    }
}
