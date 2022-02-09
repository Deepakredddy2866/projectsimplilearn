package com.simplilearn.LinearSearch;
import java.util.Scanner;
public class linearsearch {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the elements");
		int searchValue=sc.nextInt();
		int result=(int)linearing(arr,searchValue);
		if(result==-1)
		{
			System.out.println("element not in the array");
			
		}
		else
		{
			System.out.println("element"+result+"and theSearch key"+arr[result]);
			
		}
	}
	public static int linearing(int arr[],int X)
	{
		int arrlength=arr.length;
		for(int i=0;i<arrlength-1;i++)
		{
			if(arr[i]==X)
			{
				return i;
			}
		}
		return -1;
	}
	

}
