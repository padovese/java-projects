package academy.learnprogramming;

public class StringBuilderExample {
    public static void main(String[] args) {
        String myString = "";

        for (char c = 'a'; c <= 'z'; c++){
            myString += c;
        }
        System.out.println(myString);

        StringBuilder sb = new StringBuilder();

        for(char c = 'a'; c <= 'z'; c++){
            sb.append(c);
        }
        System.out.println(sb);

        StringBuilder builder = new StringBuilder("start");
        builder.append("-middle");
        StringBuilder anotherBuilder = builder.append("-end");

        System.out.println(builder);
        System.out.println(anotherBuilder);

        System.out.println(builder == anotherBuilder);
        System.out.println(System.identityHashCode(builder));
        System.out.println(System.identityHashCode(anotherBuilder));

        StringBuilder myBuilder = new StringBuilder();
        System.out.println("size= " + myBuilder.length());
        System.out.println("capacity= " + myBuilder.capacity());

        myBuilder = new StringBuilder(100);
        System.out.println("size= " + myBuilder.length());
        System.out.println("capacity= " + myBuilder.capacity());

        myBuilder.append("MyNewTest");
        System.out.println("size= " + myBuilder.length());
        System.out.println("capacity= " + myBuilder.capacity());
    }
}
