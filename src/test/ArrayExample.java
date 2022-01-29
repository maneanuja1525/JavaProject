package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//integer array
		int[] num1= {10,20,30,40,50};
		
		System.out.println("Total no. values in array: "+num1.length);
		System.out.println("Values at 3rd position: "+num1[2]);
		System.out.println("value at last position: "+num1[num1.length-1]);
		
		//string array
		String[] name1= {"abc","def", "xyz", "pqr"};
		System.out.println("Value present at 2nd position : "+name1[1]);
		
		//Array of words
		String name2="Clean India Green India";
		String[] arrWords=name2.split(" ");
		
		System.out.println("Value present at 3rd position: "+arrWords[2]);
		System.out.println("Total words present in string: "+arrWords.length);
		
		
		
	}

}
