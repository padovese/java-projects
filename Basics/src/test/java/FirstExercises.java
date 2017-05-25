import java.util.Scanner;

public class FirstExercises {
	public static void main(String[] args) {
		//Exercises 
		//http://www.w3resource.com/java-exercises/basic/index.php
		
		//Exercise 1
		System.out.println("Hello.\nBruno Padovese");
		
		//Exercise 2
		System.out.println(74+36);
		
		//Exercise 3
		System.out.println(50/3);
		
		//Exercise 4
		System.out.println(-5+8*6);
		System.out.println((55+9)%9);
		System.out.println(20+-3*5/8);
		System.out.println(5+15/3*2-8%3);
		
		//Exercise 5
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input the first number: ");
		int num1 = in.nextInt();
		
		System.out.print("Input the first number: ");
		int num2 = in.nextInt();
		
		in.close();
		
		System.out.println(num1 + " x " + num2 + " = " + num1*num2);
		
		//Exercise 7	

		int num3 = 5;
		
		System.out.println("Input the number to multiplicate it: ");		
		
		for(int i = 1; i <= 10; i++){
			System.out.println(num3 + " x " + i + " = " + num3*i);
		}
		
		//Exercise 
	}
}
