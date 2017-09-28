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
    }

    public void method(){
        super.protectedPrint();
    }
}
