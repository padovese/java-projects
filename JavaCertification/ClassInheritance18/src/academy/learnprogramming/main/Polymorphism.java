package academy.learnprogramming.main;

import academy.learnprogramming.*;

public class Polymorphism {
    public static void main(String[] args) {
        Husky h = new Husky(5);

        Dog dog = h;

        //System.out.println(dog.eyeColor());
        System.out.println(dog.getTailLength());

        Bear b = new Bear();
        BearCub bc1 = new BearCub();

//        BearCub bc = (BearCub) b;
        Bear b1 = bc1;


        Animal a = new BearCub();
        BearCub z = (BearCub) a;


    }
}
