package academic.learnprogramming;

public class NumericPromotion {
    public static void main(String[] args) {
        //promotion Values is converting "smaller" types to "bigger" types
        int x = 5;
        double y = 5.5;

        System.out.println("x +y = " + (x + y)); //Pay attention to not concatenate string with numbers

        double z = x + y;
        System.out.println("z = " + z);

        //int zz = x = y;//doesn't work, the result is a bigger type, also is float pointing

        //Casting values is converting "bigger" types to "smaller" types
        double myDouble = 5.55;
        int myInt = 4 + (int)myDouble;
        System.out.println("result= " + myInt);

        1 - double (not ok because the F is missing on float variable)
        2 - int
        3 - double

        short a = 1;
        short b = 2;

        short c = (short)(a + b);
    }
}
