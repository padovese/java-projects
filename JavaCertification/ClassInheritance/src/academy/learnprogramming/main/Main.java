package academy.learnprogramming.main;

import academy.learnprogramming.Husky;

public class Main {

    public static void main(String[] args) {
        Husky h = new Husky(0);
        h.printDetails();
        h.eat();
        System.out.println(h.getAverageWeight());
        h.setName("Rex");
        h.setAge(6);

//        Dog d = new Dog(0);
//        d.setName("Rex");
//        d.printDetails();
//        d.eat();
//        System.out.println(d.getAverageWeight());
    }
}
