package academy.learnprogramming;

class Example{
    private String name = "dog";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public Example(){
        System.out.println("constructor");
    }
}

public class OrderOfInicialization {
    public static void main(String[] args) {
        Example ex = new Example();
    }
}
