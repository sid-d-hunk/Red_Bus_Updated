package com.devsena.oecm17.patterns;

import java.util.Scanner;

public class DesignN {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Number ");
		int n=scn.nextInt();
		scn.close();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||j==i||j==n-1)
					System.out.print("*");
				else 
					System.out.print(" ");
			}System.out.println();
		}

	}

}
