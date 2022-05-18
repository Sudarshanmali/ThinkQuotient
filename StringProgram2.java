package com.StringPrograms;

class StringProgram2 {

	public static void main(String[] args) {
		
		//to reverse the string
		String s="Manual Tester";
		String s1="";
		int n=s.length()-1;
		for(int i=n;i>=0;i--)
		{
			char c=s.charAt(i);
			s1+=c;		
	
		}
		System.out.println(s1);
	}
}
