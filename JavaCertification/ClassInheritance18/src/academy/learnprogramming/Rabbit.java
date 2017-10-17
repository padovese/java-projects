package academy.learnprogramming;

public class Rabbit extends Animal implements Herbivore, Hop{
    public Rabbit() {
        super(5);
        super.eat();
    }

    public void test(){
        setAge(6);
    }

    public String test(int a){
        return super.getName();
    }

    @Override
    public int getWeight() {
        return 5;
    }

    @Override
    public void printDetails() {
        System.out.println("Rabbit avg jump height is= " + Hop.getAverageHumpHeigth());
    }
}
