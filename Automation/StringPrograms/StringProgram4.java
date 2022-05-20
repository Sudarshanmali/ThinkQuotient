package com.StringPrograms;

public class StringProgram4 {

	public static void main(String[] args) {
		
		String s="Java757464hProgram3648jbhd3634";
		String s1="";
		//o/p=javaprogramjbhd
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a'&&c<='z')
			{
				s1=s1+c;
			}
		}
		System.out.println(s1);
		
	}

}

