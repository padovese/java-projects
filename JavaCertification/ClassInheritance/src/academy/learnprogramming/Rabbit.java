package academy.learnprogramming;

public class Rabbit extends Animal {
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
    public void getWeight() {

    }
}
