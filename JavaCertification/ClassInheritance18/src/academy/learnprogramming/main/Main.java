package academy.learnprogramming.main;

import academy.learnprogramming.Bear;
import academy.learnprogramming.Cat;
import academy.learnprogramming.Husky;
import academy.learnprogramming.Rabbit;

public class Main {

    public static void main(String[] args) {
        Husky h = new Husky(0);
        h.printDetails();
        h.eat();
        System.out.println(h.getAverageWeight());
        h.setName("Rex");
        h.setAge(6);
        System.out.println(h.getTailLength());
        h.run(10);

//        Dog d = new Dog(0);
//        d.setName("Rex");
//        d.printDetails();
//        d.eat();
//        System.out.println(d.getAverageWeight());

        Bear teddy = new Bear();
        teddy.setName("Teddy");
        teddy.setAge(10);
        teddy.eatMeat();
        teddy.eatPlants();
        teddy.printDetails();

        Rabbit bunny = new Rabbit();
        bunny.eatPlants();
        bunny.printDetails();

        Cat c = new Cat(5);
    }
}
