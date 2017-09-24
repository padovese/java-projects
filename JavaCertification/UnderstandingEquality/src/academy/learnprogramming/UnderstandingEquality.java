package academy.learnprogramming;

public class UnderstandingEquality {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        StringBuilder c = a.append("hello");

        System.out.println(a == b);
        System.out.println(a == c);

        String d = "java";
        String e = "java";

        System.out.println(e == d);

        String ee = "ja";
        String f = ee + "va";

        System.out.println(d == f);

        //System.out.println(c == d);

        StringBuilder m = new StringBuilder("rumble");
        m.append(4).deleteCharAt(3).delete(3, m.length() -1);
        System.out.println(m);

//        r u m b l e 4
//        0 1 2 3 4 5 6
//        r u m l e 4
//        0 1 2 3 4 5
    }
}
