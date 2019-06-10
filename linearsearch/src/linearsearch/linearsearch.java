package linearsearch;

import java.util.Scanner;

public class linearsearch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array");
		int n=7;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the searching element");
		int b=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==b)
			{
				System.out.println("found at index: "+i);
			}
		}
	}
}
