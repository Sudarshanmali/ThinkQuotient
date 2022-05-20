package com.StringPrograms;

public class StringPallindrome {

	public static void main(String[] args) {
		String s="Racecar";
		//true
		System.out.println(isPallindrome(s));
		
	}

	public static boolean isPallindrome(String s)
	{
		s=s.toLowerCase();
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				return false;
			}		
		}
		return true;			
	}
}
