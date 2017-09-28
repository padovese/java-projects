package academy.learnprogramming;

public class MethodDesign {
    public static final void method() {
        MethodDesign m = new MethodDesign();
        System.out.println(m.method4(5, 9, 8, 4));

    }

    public int method2() {
        return 0;
    }

    int method3(int a, int b) {
        return 0;
    }

    double method4(int... a) {
        double b = 0;
        for (int c : a) b += c;
        System.out.println(a.length);
        return b;
    }

}
