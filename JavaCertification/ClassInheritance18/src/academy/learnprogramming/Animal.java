package academy.learnprogramming;

public abstract class Animal extends Object{

    private int age;
    private String name;

    public Animal(){
    }

    public Animal(int age){
        super();
        System.out.println("Animal");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("Animal is eating.");
    }

    public double getAverageWeight(){
        return 10.0;
    }

    public void printDetails(){
        System.out.println("name= "+ name + " age= " + age);
    }

    public abstract int getWeight();     //abstract method doesn't have body
}
