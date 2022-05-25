package com.ArrayPrograms;

import java.util.Arrays;
import java.util.List;

public class ArraytoArraylist {

	public static void main(String[] args) 
	{	
		Integer a[] = {70,25,86,29,97,103};
		List<Integer> l = Arrays.asList(a);	
		for (Integer i: l)
		{
			System.out.println(i);
		}
	}
}
