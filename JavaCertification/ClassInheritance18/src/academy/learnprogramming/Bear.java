package academy.learnprogramming;

public class Bear extends Animal implements Omnivore {
    @Override
    public int getWeight() {
        return 2000;
    }

    @Override
    public void eatMeat() {
        System.out.println("Bear eating meat.");
    }

    @Override
    public void eatPlants() {
        System.out.println("Bear eating plants.");
    }
}
