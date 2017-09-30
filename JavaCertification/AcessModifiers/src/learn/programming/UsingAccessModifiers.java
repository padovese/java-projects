package learn.programming;

import learn.programming.common.Common;

public class UsingAccessModifiers extends Common{
    public static void main(String[] args) {
        Common c = new Common();
        c.publicPrint();
//        c.protectedPrint();
//        c.defaultPrint();
//        c.privatePront();
        UsingAccessModifiers u = new UsingAccessModifiers();
        u.method();

        System.out.println(c.var1);
//        System.out.println(c.var2);
//        System.out.println(c.var3);
//        System.out.println(c.var4);
    }

    public void method(){
        super.protectedPrint();
        System.out.println(super.var2);
    }
}
