package ExceptionPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptionprogram2 {

	public static void main(String[] args)
	{
		try {
			FileReader f=new FileReader ("D:\\ThinkQuotient\\Test.txt");
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
}
