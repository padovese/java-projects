package academy.learnprogramming;

public class DataEncapsulation {
    public static void main(String[] args) {
        Company senac = new Company();
        senac.setName("Senac");
        senac.addEmployees("bruno padovese");
        senac.addEmployees("carlos");
        senac.addEmployees(null);
        senac.addEmployees("");


        senac.printSorted();


        /*
        senac.employees = null;

        senac.addEmployees("otavio");

        senac.printSorted();*/
    }
}
