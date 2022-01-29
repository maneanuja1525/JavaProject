package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Order Confirmation= 2515";
		FileOutputStream file1;
		try {
			file1=new FileOutputStream("Result.txt");
			file1.write(str1.getBytes());
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
