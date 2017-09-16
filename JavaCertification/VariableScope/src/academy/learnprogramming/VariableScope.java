package academy.learnprogramming;

public class VariableScope {

    static int myNewInt = 5;
    static int myOtherInt = 40;

    public static void main(String[] args) {
        int myLocalInt = 10;

        {
            int myOtherInt = 20;
            System.out.println("myOtherInt= " + myOtherInt);
            System.out.println("inCodeBlock MyLocalInt= " + myLocalInt);
        }
//        System.out.println("myOtherInt= " + myOtherInt);

        int myOtherInt = 30;
        System.out.println("myOtherInt= " + myOtherInt);

    }
}
