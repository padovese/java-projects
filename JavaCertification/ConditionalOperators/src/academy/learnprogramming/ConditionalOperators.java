package academy.learnprogramming;

public class ConditionalOperators {
    public static void main(String[] args) {
        //&& and
        // || or
        // ^ different

        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = a && b;

        int f = 4;
        boolean g = false && (f++ < 4);
        boolean h = (f-- == 4) && !g;

        System.out.println("f= " + f);
        System.out.println("g= " + g);
        System.out.println("h= " + h);


        int myInt = 3;
        int anotherInt = 4;
        boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);

        System.out.println("myInt= " + myInt);
        System.out.println("anotherInt= " + anotherInt);
        System.out.println("myBoolean= " + myBoolean);



    }
}
