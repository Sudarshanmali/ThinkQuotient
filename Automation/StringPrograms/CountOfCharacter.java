package com.StringPrograms;

public class CountOfCharacter {

	public static void main(String[] args) {
		String s="Java Development";
		//o/p=(e-3)
		System.out.println(getcount(s,'e'));
		System.out.println(getcount(s,'D'));
		System.out.println(getcount(s,'m'));
		System.out.println(getcount(s,'n'));
			
	}

	static int getcount(String s, char c) {
		return s.length()-s.replace(c+"","").length();
	}

}
