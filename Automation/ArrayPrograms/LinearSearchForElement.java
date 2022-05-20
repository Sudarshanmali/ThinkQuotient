package com.ArrayPrograms;

public class LinearSearchForElement {

	public static void main(String[] args) {
		int[] arr={3,5,9,45,63,56,87,75,25,76,56,45,135};
		System.out.println(linersearchforelement(arr,56));
		System.out.println(linersearchforelement(arr,135));
		System.out.println(linersearchforelement(arr,100));
	}

	public static int linersearchforelement(int[] arr, int ele) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				return i;
			}
		}
		return -1;
	}

}
