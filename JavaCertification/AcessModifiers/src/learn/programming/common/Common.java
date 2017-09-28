package learn.programming.common;

public class Common {

    public void publicPrint(){
        System.out.println("public method");
    }

    protected void protectedPrint(){
        System.out.println("protected method");
    }

    void defaultPrint(){
        System.out.println("default method");
    }

    private void privatePront(){
        System.out.println("private method");
    }

    public static void main(String[] args) {
        Common c = new Common();
        c.publicPrint();
        c.protectedPrint();
        c.defaultPrint();
        c.privatePront();
    }
}
