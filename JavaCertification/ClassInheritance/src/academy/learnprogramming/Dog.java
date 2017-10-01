package academy.learnprogramming;

public abstract class Dog extends Animal {
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

    public void test(){

    }


}
