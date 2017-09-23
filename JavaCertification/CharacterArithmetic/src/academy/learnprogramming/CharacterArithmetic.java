package academy.learnprogramming;

public class CharacterArithmetic {
    public static void main(String[] args) {
        char myCharA = 'A';
        char myCharNum = '1';

        System.out.println("myCharA= " + myCharA);
        System.out.println("myCharA isLetter= " + Character.isLetter(myCharA));
        System.out.println("myCharA isLetter= " + Character.isDigit(myCharA));

        System.out.println("myCharNum= " + myCharNum);
        System.out.println("myCharNum isLetter= " + Character.isLetter(myCharNum));
        System.out.println("myCharNum isLetter= " + Character.isDigit(myCharNum));

        char letter = 65;
        int myInt = letter + 3;
        char myNewLetter = (char)myInt;

        System.out.println(letter);
        System.out.println(myInt);
        System.out.println(myNewLetter);

        char myChar = 65;
        char newChar = (char)(myChar + 1);
        boolean b = newChar == 'B';
        boolean c = (newChar++ < 'D');

        System.out.println(myChar);
        System.out.println(newChar);
        System.out.println(b);
        System.out.println(c);

        int p = 10;
        if (p > 9){
            System.out.println("a");
            System.out.println("b");
        } else if (p < 9) System.out.println("c");
        else {
            System.out.println("d");
            System.out.println("e");
        }
    }
}
