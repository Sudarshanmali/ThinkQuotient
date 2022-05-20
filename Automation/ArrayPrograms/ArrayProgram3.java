package com.ArrayPrograms;

public class ArrayProgram3 {

	public static void main(String[] args) {
		int[] ar= {3,5,9,45,63,56,87,75,25,76,56,45,135};
		//o/p=87
		int bigger=0;
		for(int a:ar)
		{
			if(bigger<a)
			{
				bigger=a;
			}
		}
		System.out.println("Bigger="+bigger);
	}
}
