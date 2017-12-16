package com.devsena.oecm17.patterns;

import java.util.Scanner;

public class DesignQ {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Number ");
		int n=scn.nextInt();
		scn.close();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0&&j!=0&&j!=(n-1)||j==0&&i!=0&&i!=(n-1)||i==n-1&&j!=0&&j!=(n-1)||j==n-1&&i!=0&&i!=(n-1)||i==j&&i>n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
		}
		for(int i=n;i<n+n/4+1;i++)
		{
			for(int j=0;j<n+n/4+1;j++)
			{
				if(i==j)
				System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
