package com.ArrayPrograms;

public class ArrayProgram2 {

	public static void main(String[] args) {
		String s="Java is very easy Language";
		String[] s1=s.split(" ");
		for(String s2:s1)
		{
			System.out.print(reversestring(s2)+" ");
			}
	}
	public static String reversestring(String s2) {
		StringBuilder sb=new StringBuilder();
		for(int i=s2.length()-1;i>=0;i--)
		{
			sb.append(s2.charAt(i));
		}
		return sb.toString();
	}
}