package academy.learnprogramming;

public class DoWhileLoop {
    public static void main(String[] args) {
        int a = 1;

        if (true)
            do System.out.println(a);
            while (a++ == 1);
        System.out.println(9);

        int y = 10;
        int z = 5;
        while (y < 20)
            y++;
        z += 2;
        y += 10;

        System.out.println("y= " + y + " z= " + z);

        int q = 10;
        while(q > 0){
            q--;
            break;
        }
        System.out.println("a= " + q);

        int w = 10;

        do{
            w--;
            break;
        } while (w > 0);

        System.out.println("w= " + w);
    }
}
