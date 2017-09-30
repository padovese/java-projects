package academy.learnprogramming;

public class Counter{

    public static int count;
    int a;

    public Counter(){
        count++;
        a++;
    }

    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();

        System.out.println(count);
        //System.out.println(a);

        System.out.println(c1.count);
        System.out.println(c2.count);
        System.out.println(c3.count);
        System.out.println(c4.count);

        System.out.println(c1.a);
        System.out.println(c2.a);
        System.out.println(c3.a);
        System.out.println(c4.a);


    }
}
