package academy.learnprogramming;

public class StringEquality {
    public static void main(String[] args) {
        String name = "John";
        String anotherName = "John";
        String john = "Jo" + "hn";
        String newName = new String("John");

        System.out.println("name == anotherName -> " + (name == anotherName));
        System.out.println("name == john -> " + (name == john));
        System.out.println("name == newName -> " + (name == newName));

        System.out.println("name.equals(anotherName) -> " + name.equals(anotherName));
        System.out.println("name.equals(john) -> " + name.equals(john));
        System.out.println("name.equals(newName) -> " + name.equals(newName));

        System.out.println("name - identityHashCode -> " + System.identityHashCode(name));
        System.out.println("anotherName - identityHashCode -> " + System.identityHashCode(anotherName));
        System.out.println("john - identityHashCode -> " + System.identityHashCode(john));
        System.out.println("newName - identityHashCode -> " + System.identityHashCode(newName));

        String abc = "abc";
        String c = "c";
        String ab_c = "ab" + c;

        System.out.println("abc == ab_c -> " + (abc == ab_c)
        );
    }
}
