package academy.learnprogramming;

public class Cat extends Animal implements Herbivore, Carnivore{
    public Cat(int age){
        super(age);
    }

    @Override
    public int getWeight() {
        return 5;
    }
}
