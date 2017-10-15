package academy.learnprogramming;

class NoMoreMeatException extends Exception {

}

class NoMorePlantsException extends RuntimeException {

}

interface omnivore {
    void eatMeat(int amount) throws NoMoreMeatException;

    void eatPlants(int amount);
}

class Bear implements omnivore{
    @Override
    public void eatMeat(int amount) throws NoMoreMeatException{
        if (amount <= 0) {
            throw new NoMoreMeatException();
        }
        System.out.println("Eating meat.");
    }

    @Override
    public void eatPlants(int amount) {
        if (amount <= 0) {
            throw new NoMorePlantsException();
        }
    }
}

public class MethodsWithExceptions {

    public static void main(String[] args) {
        Bear bear = new Bear();
        try{
            bear.eatMeat(-1);
        } catch(NoMoreMeatException e){
            System.out.println(e.getStackTrace());
        } finally {
            System.out.println("Finally");
        }

        bear.eatPlants(-2);
    }

    public static ArithmeticException method(){
        return new ArithmeticException();
    }
}
