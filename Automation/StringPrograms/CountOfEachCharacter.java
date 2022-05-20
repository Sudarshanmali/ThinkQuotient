package com.StringPrograms;

public class CountOfEachCharacter {

	public static void main(String[] args) {
		String s="Java Development";
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(s1.indexOf(c)==-1)
			{
				int n=CountOfCharacter.getcount(s, c);
				System.out.println(c+"="+n);
				s1=s1+c;
			}
		}

	}
	
}
