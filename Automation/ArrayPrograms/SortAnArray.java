package com.ArrayPrograms;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		int[] arr={3,5,9,45,63,56,87,75,25,76,56,45,135};
		Arrays.sort(arr);
		for(int a:arr)
		{
			System.out.println(a);
		}	
	}

}
