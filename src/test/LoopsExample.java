package test;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//While Loop
		int num1=1;
		while(num1<=10)
		{
			if(num1==5)
			{
				num1=num1+1;
				continue;
			}
			System.out.println(num1);
			num1=num1+1;
		}
		System.out.println("\n****For Loop Example ****");
		//for loop
		for(int count=10;count>=1;count--)
		{
			
			System.out.println(count);
			
		}
		//Arrays with for loop
		int[] array1= {10,20,30,40,50};
		System.out.println("\n values inside array: ");
		for(int index=0;index<array1.length;index++)
		{
			
			System.out.println(array1[index]);
		}
		
		//foreach loop
		System.out.println("\n example of foreach loop");
		for(int value:array1)
		{
			System.out.println(value);
		}
		//Do While Loop
	}

}
