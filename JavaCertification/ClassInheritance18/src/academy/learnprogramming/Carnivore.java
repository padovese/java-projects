package academy.learnprogramming;

public interface Carnivore {
    //void eatMeat(); Normal method, is automatic public and abstract

    default void eatMeat(){
        System.out.println("Eating meat.");
    }


}
