package academy.learnprogramming;

public class UsingFinally {

    public static void main(String[] args) {
        String[] array = {"One", "Two", "Three"};

        System.out.println(firstToUppercase(array));

        array[0] = null;

        try {
            System.out.println(firstToUppercase(array));
        } catch (NullPointerException npe) {
            System.out.println("Valor= " + npe.getMessage());
        } finally {
            System.out.println("end.");
        }

        array[0] = "One";


        try {
            System.out.println(firstToUppercase(array));
        } finally {
            System.out.println("end.");
        }

    }

    public static String firstToUppercase(String[] array) {
        return array[0].toUpperCase();
    }

}
