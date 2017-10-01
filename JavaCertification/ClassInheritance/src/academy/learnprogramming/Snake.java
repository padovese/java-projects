package academy.learnprogramming;

public class Snake extends Reptile{
    public boolean hasLegs(){
        return false;
    }

    @Override
    public double getWeight() {
        return 0.5;
    }
}
