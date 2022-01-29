package test;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag=true;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num= s.nextInt();
		for(int i=2;i<num/2;i++) {
			int temp=num%i;
			if(temp==0) {
				flag=false;
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println(num+" is prime number");
		}
		else {
			System.out.println(num+" is not prime number");
		}
		
	}

}
