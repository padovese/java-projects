package academy.learnprogramming;

public class Rope {
    public static void main(String[] args) {

        Rope rope = new Rope();
        rope.swing();

        swing();

        Rope rope2 = null;
        rope2.swing();

        rope.climb();
        rope2.climb();
        
        int pato = 1;
        System.out.println(pato);
    }

    public static void swing(){
        System.out.println("swing");
    }

    public void climb(){
        System.out.println("climb");
    }


}
