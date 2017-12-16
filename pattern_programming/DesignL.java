package com.devsena.oecm17.patterns;

import java.util.Scanner;

public class DesignL {


	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Number ");
		int n=scn.nextInt();
		scn.close();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||i==n-1&&j<=n/2+2)
					System.out.print("*");
			}System.out.println();
		}

	}

}
