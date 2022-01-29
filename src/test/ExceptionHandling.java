package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Exception Handling---Try Catch Block
		//int num=10;
		int[] arr1= {10,20,30,40,50};
		try {
			//int r=num/0;
			System.out.println(arr1[8]);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside ArithmeticException block");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Inside ArrayIndexOutOfBoundsException block");
		}
		catch(Exception e)
		{
			System.out.println("Inside Exception Block");
		}
		System.out.println("after catch block");
		
	}

}
