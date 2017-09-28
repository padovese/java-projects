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

    public String var1 = "public string";
    protected String var2 = "protected string";
    String var3 = "default string";
    private String var4 = "private string";

    public static void main(String[] args) {
        Common c = new Common();
        c.publicPrint();
        c.protectedPrint();
        c.defaultPrint();
        c.privatePront();

        System.out.println(c.var1);
        System.out.println(c.var2);
        System.out.println(c.var3);
        System.out.println(c.var4);
    }
}
