package academy.learnprogramming;

public class MethodChaining {
    public static void main(String[] args) {
        String start = "   JaVa   ";

        String trimmed = start.trim();
        System.out.println(trimmed);

        String lowerCase = trimmed.toLowerCase();
        System.out.println(lowerCase);

        String result = lowerCase.replace('j', 'J');
        System.out.println(result);

        String anotherStart = "   JaVa   ".trim().toLowerCase().replace('j', 'J');
        System.out.println(anotherStart);
        System.out.println(result.equals(anotherStart));


    }
}
