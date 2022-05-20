package com.StringPrograms;

public class StringProgram3 {

	public static void main(String[] args) {
		
		String s="Java757464hProgram3648jbhd3634";
		String s1="";
		//o/p=75746436483634
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0'&&c<='9')
			{
				s1=s1+c;
			}
		}
		System.out.println(s1);
		
	}

}
