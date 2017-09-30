package academy.learnprogramming;

public class DogTester {
    public static void main(String[] args) {
        Dog husky = new Dog();
        System.out.println(husky.count);
        System.out.println(Dog.count);

        Dog terrier = new Dog();
        terrier.incrementCount();

        Dog.incrementCount();

        System.out.println(Dog.count);
    }
}
