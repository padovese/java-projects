package academy.learnprogramming;

public class DecimalNumericPrimitives {
    public static void main(String[] args) {
        float myNumber = 25.4F;
        double before = 10_001.25;

//        double a = 10_.25;
//        double b = 10._25;
//        double c = _10.25;
//        double d = 10.25_;
        double one_$ = 1;

        double scientific = 5.000125E03;
        double scientific1 = 5.000125E3;
        double scientific2 = 5.000125E99;

        System.out.println(scientific);
        System.out.println(scientific1);
        System.out.println(scientific2);

        double hexPi = 0x1.91eb851eb851fp1;

        System.out.println(hexPi);
    }
}
