package academy.learnprogramming;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("programming");
        String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi"));
        char ch = sb.charAt(5);
        System.out.println("substring= " + sub + " charAt= " + ch);


        StringBuilder b = new StringBuilder().append(1).append("abc").append(2.0).append(true);
        System.out.println(b);

        StringBuilder builder = new StringBuilder("programming");
        builder.insert(0, "Ç");
        builder.insert(11, "Ç");
        //builder.insert(15, "Ç"); trhows excpetion

        System.out.println(builder);

        builder.delete(4, 9 );
        System.out.println(builder);
        builder.deleteCharAt(3);
        System.out.println(builder);

        StringBuilder sb1 = new StringBuilder("ABC123");
        sb1.reverse();
        System.out.println(sb1);

        String myString = sb1.toString();
        System.out.println(myString.to);
    }
}
