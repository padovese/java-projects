package academy.learnprogramming;

public class ContinueStatement {
    public static void main(String[] args) {
        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        MY_LOOP:
        for(String animal : animals){
            if(animal.equals("Cat")){
                continue MY_LOOP;
            }

            System.out.println(animal);
        }

        animal:
        for(String animal : animals){
            if(animal.equals("Cat") || animal.equals("Lizard")){
                continue animal;
            }

            System.out.println(animal);
        }
    }
}
