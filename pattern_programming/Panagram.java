package devsena.oecm17;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter string");
	String s=scn.nextLine();
	 s=upperCase(s);
	System.out.println(s);
	boolean b=check(s);
	if(b){
		System.out.println("Is a panagram");
	return;}
	System.out.println("Not a panagram");
	

	}
	public static boolean check(String s)
	{char [] ch=s.toCharArray();
	char [] ch1={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	for(int i=0;i<ch1.length;i++)
	{
		for(int j=0;j<ch.length;j++)
		{
			if((ch1[i]==ch[j]))
			{
				
				System.out.print(ch1[i]);
				ch1[i]='0';
						break;
				
				
			}
			
			//ABCDEFGHIJKLMNOPQRSTUVWXYZ
			
		}if(ch1[i]!='0')
			return false;
	}
	return true;
		
	}
	public static String upperCase(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i++){
		if(s.charAt(i)>='a'&&s.charAt(i)<='z')
		{
			char temp=(char)(s.charAt(i)-32);
			s1+=temp;
		}
		else
			s1+=s.charAt(i);
		}
		return s1;
	}

}
