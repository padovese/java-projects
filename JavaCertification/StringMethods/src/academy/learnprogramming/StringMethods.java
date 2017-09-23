package academy.learnprogramming;

public class StringMethods {
    public static void main(String[] args) {
        String str = "java is fun";

        //length
        System.out.println(str.length());

        //char at
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(4));
//        System.out.println(str.charAt(-1));
//        System.out.println(str.charAt(13));

        //index of
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('a', 2));
        System.out.println(str.indexOf("fun"));
        System.out.println(str.indexOf('a', -5));

        //substring
        System.out.println(str.substring(8));
        System.out.println(str.substring(8, 11));
//        System.out.println(str.substring(8, 12)); // aray out of range
        System.out.println(str.substring(4, 4));

        System.out.println("abc".);
    }
}
