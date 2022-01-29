package test;

import java.util.Scanner;

public class ConditionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if else condition example
		//Scanner class is used to get input from user
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Age : ");
		
		int age=scanner.nextInt();
		if(age>=18) {
			System.out.println("You are eligible for voting");
		}
		else if(age<=17)
		{
			System.out.println("you are not eligible for voting this year. Try next year ");
		}
		else
		{
			System.out.println("You are not eligible");
		}
		scanner.close();
	}

}
