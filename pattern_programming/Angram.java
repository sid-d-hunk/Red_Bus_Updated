package com.devsena.oecm17.String;

import java.util.Scanner;

public class Angram {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 1st String");
		String s=scn.nextLine();
		System.out.println("Enter 2nd String");
		String s1=scn.nextLine();
		scn.close();
		s=removeSpace(s);
		s1=removeSpace(s1);
		
		char [] c=s.toCharArray();
		char [] c1=s1.toCharArray();
		boolean b=checkLength(c, c1);
		
		if(b)
		{toLowerCase(c);
		toLowerCase(c1);
		sort(c);
		sort(c1);
	    b=compare(c,c1);
	    if(b)
	    System.out.println("String is a Anagram");
	    else
	    	System.out.println("String is not a Anagram");
		}else
			System.out.println("String is not a Anagram");
		}

	public static String removeSpace(String  s)
	{ String s1="";
		for(int i=0;i<s.length();i++)
		if(s.charAt(i)==' ');
		else
			s1+=s.charAt(i);
		return s1;
			
		
	}
	
	public static boolean checkLength(char [] c,char [] c1)
	{if(c.length==c1.length)
		return true;
	return false;
	}
	
	
	public static void toLowerCase(char [] x)
	{
		for(int i=0;i<x.length;i++)
		{
		if(x[i]>='A'&&x[i]<='Z')
		x[i]=(char)(x[i]+32);
		
		
		}
		
	}
	public static void sort(char[] x) {
		for(int i=0;i<x.length;i++)
		{
			for(int j=i;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					char temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		}
	public static boolean compare(char[] x,char[] y)
	{
		for(int i=0;i<x.length;i++)
		{
			if(!(x[i]==y[i]))
			return false;
		}
		return true;
	}
}
	
		
	


