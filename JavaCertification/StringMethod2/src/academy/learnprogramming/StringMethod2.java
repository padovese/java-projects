package academy.learnprogramming;

public class StringMethod2 {
    public static void main(String[] args) {
        String str = "java";
        String str2 = "Java";
        String str3 = "ja";

        //Equals
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str));
        System.out.println("abc".equalsIgnoreCase("ABC"));

        //startsWith endsWith
        System.out.println(str.startsWith("j"));
        System.out.println(str.startsWith(str3));
        System.out.println(str.startsWith("J"));
        System.out.println(str.endsWith("va"));

        //contains
        System.out.println(str.contains(str3));
        System.out.println(str.contains("av"));
        System.out.println(str.contains("aj"));


        String str4 = "java is cool";
        //replace
        System.out.println(str.replace('a', 'A'));
        System.out.println(str.replace(" ", "_"));

        //trim
        System.out.println(" JAVA    LOL   ".trim());
    }
}
