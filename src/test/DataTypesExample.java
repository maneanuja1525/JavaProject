package test;

public class DataTypesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=50;
		int num2=30;
		int sum=num1+ num2;
		int sub=num1-num2;
		int mult=num1*num2;
		float div=(float)num1/num2;
		String result= "Sum of num1 and num2 is "+ sum;
		
		System.out.println("Sum = "+sum);
		System.out.println("Subtraction = "+sub);
		System.out.println("Mulitplication = "+mult);
		System.out.println("Division = "+div);
				
		String str="Clean India Green India";
		System.out.println("Total no. of chars: "+str.length());
		
		
		char char1=str.charAt(2);
		char char2= str.charAt(str.length()-1);
		System.out.println("char at second index is : "+char1);
		System.out.println("char at last place: "+char2);
		
		System.out.println("string in uppercase= "+str.toUpperCase());
		System.out.println("string in lowecase= "+str.toLowerCase());
		
		
	}

}
