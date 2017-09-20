package academy.learnprogramming;

public class ObjectEquality {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;

        System.out.println("a == b: " + (a == b));

        Integer c = 128;
        Integer d = 128;

        System.out.println("c == d " + (c == d));

        Integer.valueOf(128);

        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        Integer int3 = 1;

        System.out.println(int1 == int2);
        System.out.println(int1 == int3);
        System.out.println(int2 == int3);

        System.out.println(int1.equals(int2));
        System.out.println(int1.equals(int3));
        System.out.println(int2.equals(int3));

        System.out.println(System.identityHashCode(int1));
        System.out.println(System.identityHashCode(int2));
        System.out.println(System.identityHashCode(int3));
    }

}
