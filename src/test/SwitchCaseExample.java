package test;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Clean India Green India";
		int vowelcount=0;
		
		for(int index=0;index<str.length();index++)
		{
			char temp=str.charAt(index);
			switch(temp)
			{
			  case 'a':
			  case 'e':
			  case 'i':
			  case 'o':
			  case 'u':
			  case 'A':
			  case 'E':
			  case 'I':
			  case 'O':
			  case 'U':
				  vowelcount=vowelcount+1;
				  break;
				 	   
			}
		}
		System.out.println("Vowel count is : "+vowelcount);
	}

}
