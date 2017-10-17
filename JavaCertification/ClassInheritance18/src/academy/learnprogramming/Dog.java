package academy.learnprogramming;

public abstract class Dog extends Animal implements HasTail, CanRun{
    public Dog(int age){
        super(age);
        System.out.println("Dog");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog is eating");
    }

    @Override
    public double getAverageWeight() {
       return super.getAverageWeight() + 20;
    }

    public abstract void printName();

    public int getTailLength(){
        return 5;
    }

    public void run(int speed){
        System.out.println("The god is running at speed: " + speed);
    }



}
