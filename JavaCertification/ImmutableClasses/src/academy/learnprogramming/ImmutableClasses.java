package academy.learnprogramming;

public class ImmutableClasses {
    public static void main(String[] args) {
        Complex c = new Complex(1, 5);
        c = c.plus(new Complex(2, 8));

        System.out.println(c.getReal());
        System.out.println(c.getImaginary());
    }
}
