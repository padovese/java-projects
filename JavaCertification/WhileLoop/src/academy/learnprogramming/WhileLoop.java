package academy.learnprogramming;

public class WhileLoop{
    public static void main(String[] args) {
        int spaceOnHdd = 5;
//
//        while(spaceOnHdd > 0){
//            spaceOnHdd--;
//            System.out.println("spaceOnHdd= " + spaceOnHdd);
//        }
        while(spaceOnHdd > 0)
            System.out.println("spaceOnHdd= " + --spaceOnHdd);
        System.out.println(1);


        int x = 2;
        int y = 5;

        while(x < 10){
            y++;
            x++;
        }

        System.out.println("x= " + x + " y= " + y);

        int a = 5;
        int b = 7;

        while(a > 6){
            b += 2;
            a++;
        }

        a = a > 6 ? a++ : b--;

        System.out.println("a= " + a + " b= " + b + " a+b= " + (a+b));

    }
}
