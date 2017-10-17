package academy.learnprogramming.main;

import academy.learnprogramming.*;

public class PolyParameters {

    public static void main(String[] args) {
        Husky husky = new Husky(1);
        husky.setName("Doguin");
        printDetails(husky);

        Cat cat = new Cat(2);
        cat.setName("Pussy");
        printDetails(cat);

//        Bear bear = new Bear();
//        BearCub bearCub = (BearCub) bear;

        Animal h = createObject("Husky");
        h.printDetails();

        Husky h1 = createObject("Husky");

    }

    public static void printDetails(Animal animal){
        animal.printDetails();
    }

    public static Animal createObject(String type){
        if(type.equals("Husky")){
            return new Husky(0);
        } else if (type.equals("Cat")){
            return new Cat(1);
        } else {
            return new Rabbit();
        }
    }
}
