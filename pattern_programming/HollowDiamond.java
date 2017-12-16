package com.devsena.oecm17.patterns;
import java.util.Scanner;

public class HollowDiamond {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int n=scn.nextInt();
		scn.close();
		n=(n+1)/2;
		for(int i=0;i<n;i++)
		{
			for (int k=0;k<n-i-1;k++)
			{
				
				System.out.print(" ");
			}
			for (int j=0;j<2*i+1;j++)
			{
				if(j==0||j==2*i)
				System.out.print("*");
			else 
				System.out.print(" ");
			}
			System.out.println();
		}
		n=n-1;
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<n-i+1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=(i-1)*2;j++)
			{
				if(j==0||j==((i-1)*2))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
