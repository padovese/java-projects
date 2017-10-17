package academy.learnprogramming;

public interface Herbivore {
    default public void eatPlants(){
        System.out.println("Eating plants.");
    }


}
