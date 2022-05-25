package com.ArrayPrograms;

import java.util.ArrayList;

public class ArraylisttoArray {

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(70);
		al.add(25);
		al.add(86);
		al.add(29);
		al.add(97);
		al.add(103);
		
		Integer at[]=new Integer[al.size()];
		
		for(int i=0;i<al.size();i++)
		{
			at[i]=al.get(i);
		}
		for(Integer i : at)
		{
			System.out.println(i);
		}

	}

}
