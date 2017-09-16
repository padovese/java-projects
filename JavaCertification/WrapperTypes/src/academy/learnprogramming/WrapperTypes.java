package academy.learnprogramming;

public class WrapperTypes {
    int age;
    int size;

    public void printValues(int age, int size){
        System.out.println("age= " + age + " size= " + size);
    }

    private static void printSum(Integer first, Integer second){
        Integer sum = first + second;
        System.out.println("sum= " + sum);
    }

    public static void main(String[] args) {
        int myInt = 10;
        Integer myInteger = new Integer(10);
        Integer myInteger2 = 20;
        Integer myInteger3 = Integer.valueOf(10);
        Integer myInteger4 = Integer.parseInt("3");
        Integer myInteger5 = null;
//        int myInt2 = null;

        System.out.println("myInteger= " + myInteger);
        System.out.println("myInteger2= " + myInteger2);
        System.out.println("myInteger3= " + myInteger3);
        System.out.println("myInteger4= " + myInteger4);
        System.out.println("myInteger5= " + myInteger5);

        //converting wrapper to primitive -> unboxing
        int myInt3 = myInteger3;
//        int myInt4 = myInteger5;

        //converting primitive to wrapper -> boxing
        Integer myInteger6 = new Integer(00);
        Integer myInteger7 = myInt;

        printSum(1,5);  //autoBoxing
        printSum(myInteger, myInteger2);



        WrapperTypes w = new WrapperTypes();
        w.printValues(26, 184);
    }
}
