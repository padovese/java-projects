package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;

public class Company {

    private String name;
    private ArrayList<String> employees = new ArrayList<>();

    public void printSorted(){
        System.out.println("Company= " + name);
        Collections.sort(employees);
        System.out.println(employees);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addEmployees(String employee){
        if(employee == null || employee.isEmpty()){
            System.out.println("Parameter cannot be null or empty.");
        } else {
            employees.add(employee);
        }
    }
}
