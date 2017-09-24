package academy.learnprogramming;

public class BreakStatement {
    public static void main(String[] args) {

        myLabel:
        {
            int[] myArray = new int[3];
        }

        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};
        $_MY_LOOP:
        for (String animal : animals) {
            if (animal.equals("Lizard"))
                break $_MY_LOOP;

            System.out.println(animal);
        }

        int index = 0;
        while(index < animals.length){
            String animal = animals[index];

            if(animal.equals("Lizard"))
                break;

            System.out.println(animal);
            index++;
        }
    }
}
