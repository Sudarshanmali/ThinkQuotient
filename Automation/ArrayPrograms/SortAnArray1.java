package com.ArrayPrograms;

public class SortAnArray1 {

	public static void main(String[] args) {
		int[] arr={3,5,9,45,63,56,87,75,25,76,56,45,135};
		sortanarray(arr);
		for(int a:arr) 
		{
			System.out.println(a);
		}
	}

	public static void sortanarray(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])//(> for ascending order)
				{                //(< for descending order)
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}	
	}
}
