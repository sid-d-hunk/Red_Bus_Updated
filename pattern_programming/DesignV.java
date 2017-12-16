package com.devsena.oecm17.patterns;

import java.util.Scanner;

public class DesignV {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Number ");
		int n=scn.nextInt();
		scn.close();int k=0;int l=n-1;
		for(int i=0;i<n;i++)
		{
			
			
			for(int j=0;j<n;j++)
			{
				if(i%2==0&&(j==k||j==l))
					System.out.print("*");
				else
					System.out.print(" ");
				
				
			}System.out.println();
			if(i%2==0){
				k++;l--;
				}
		}

	}

}
