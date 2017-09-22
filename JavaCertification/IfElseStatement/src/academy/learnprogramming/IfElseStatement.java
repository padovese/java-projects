package academy.learnprogramming;

public class IfElseStatement {
    public static void main(String[] args) {
        boolean a = true;

        if(!a){
            System.out.println("true");
        } else{
            System.out.println("false");
        }

        int testScore = 76;
        char grade;

        if (testScore >= 90){
            grade = 'A';
        } else if(testScore >= 80){
            grade = 'B';
        } else if(testScore >= 70){
            grade = 'C';
        } else if(testScore >= 60){
            grade = 'D';
        } else if(testScore >= 50){
            grade = 'E';
        } else{
            grade = 'F';
        }

        System.out.println(grade);

        int hoursOfDay = 10;
        if(hoursOfDay < 11) System.out.println("Morning");
        else if(hoursOfDay < 17) System.out.println("Evening");
        else System.out.println("Day");
        hoursOfDay++; //this execute outside de if statement
    }
}
