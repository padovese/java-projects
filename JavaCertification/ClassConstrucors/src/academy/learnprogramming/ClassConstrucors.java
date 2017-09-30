package academy.learnprogramming;

public class ClassConstrucors {
    public static void main(String[] args) {
        Dog puppy = new Dog("grey");
        System.out.println(puppy.color);
    }
}

class Dog {
    String color;
    int weight;

    public Dog(String color) {
        this(color, 0);
        this.color = color;
        System.out.println("Constructor");
    }

    protected Dog(String color, int weight) {
        System.out.println("Constructor with 2 parameters");
        System.out.println(color + "  " + weight);
    }

}
