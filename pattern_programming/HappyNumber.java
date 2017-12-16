package com.devsena.oecm17.patterns;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		  Scanner scn=new Scanner(System.in);
		  System.out.print("Check Happy number from 1 to Enter number: ");
		  int n=scn.nextInt();
		  for(int i=1;i<=n;i++)
		  {
			  boolean b=happyNumber(i);
			  if(b)
			  {
				  System.out.print(i+" ");
			  }
		  }
		  
		/*  boolean b=happyNumber(n);
		  if(b)
		  System.out.println(n+" Number Is Happy");
		  else
			  System.out.println(n+" Number Is Sad");*/
		  
		  
		
	}
	static boolean happyNumber(int n)
	{
		int r;
		int sum=0;
		while(sum!=1)
		{
			sum=0;
		while(n!=0)
		{
			r=n%10;
			sum+=(r*r);
			n=n/10;
		}
		n=sum;
		if(sum==4||sum==16||sum==37||sum==58||sum==89||sum==145||sum==42||sum==20)
		{
			return false;
		}
		
		
		}
		return true;
		
	}

}
