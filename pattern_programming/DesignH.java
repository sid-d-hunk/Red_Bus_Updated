package com.devsena.oecm17.patterns;

import java.util.Scanner;

public class DesignH {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Number greater than 5");
		int n=scn.nextInt();
		scn.close();
		if(n%2==0)
			n=n+1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n/2;j++)
			{
				if(j==0||j==(n/2-1)||i==n/2){
				System.out.print("*");}
				else{
					System.out.print(" ");}
			}System.out.println();
		}

	}


}
