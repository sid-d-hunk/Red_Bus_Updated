package com.devsena.oecm17.patterns;

import java.util.Scanner;

public class DesignI {

	public static void main(String[] args) {
			Scanner scn= new Scanner(System.in);
			System.out.println("Enter Number ");
			int n=scn.nextInt();
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i==0||j==n/2||i==n-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}System.out.println();
			}

	}

}
