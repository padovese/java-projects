package learn.programming.common;

public class AnotherCommon {
    public static void main(String[] args) {
        Common c = new Common();
        c.publicPrint();
        c.protectedPrint();
        c.defaultPrint();
//        c.privatePront();

        System.out.println(c.var1);
        System.out.println(c.var2);
        System.out.println(c.var3);
//        System.out.println(c.var4);
    }
}
