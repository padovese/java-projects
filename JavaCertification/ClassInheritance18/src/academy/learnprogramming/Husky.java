package academy.learnprogramming;

public class Husky extends Dog{
    public Husky(int age){
        super(age);
        System.out.println("Husky");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Husky is eating");
    }

    @Override
    public int getWeight() {
        return 20;
    }

    @Override
    public void printName() {

    }

    public int getTailLength(){
        return 20;
    }

    public String eyeColor(){
        return "Blue";
    }


}
