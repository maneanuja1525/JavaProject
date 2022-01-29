package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reversing of String
		String str="Clean India Green India";
		String revStr="";
		
		for(int index=str.length()-1;index>=0;index--)
		{
			revStr=revStr+str.charAt(index);
		}
		System.out.println("Reversed String : "+revStr);
		
		//Number of vowels
		int result=0;
		String strlower=str.toLowerCase();
		for(int index=0;index<strlower.length();index++) {
			
			if(strlower.charAt(index)=='a'||strlower.charAt(index)=='e'||strlower.charAt(index)=='i'||strlower.charAt(index)=='o'||strlower.charAt(index)=='u')
			{
				result++;
			}	
			
		}
		System.out.println("Number of Vowels: "+ result);
		
		
		//Reversing of array
		int[] arr= {10,20,30,40,50};
		for(int index=arr.length-1;index>=0;index--)
		{
			System.out.println(arr[index]);
		}
		
		
		//Reverse number
		
		int num=1233454;
		int rev=0,r;
		
		while(num>0)
		{
			r= num%10;
			rev=num*10+r;
			num=num/10;
					
		}
		System.out.println("Reversal number is: "+rev);
	}

}
