package com.nit.string;

import java.util.Scanner;

public class CheckStringPalindromeOrNot02 {

	public static void main(String[] args) {
		//gather input from enduser
		Scanner sc=new Scanner(System.in);
		System.out.println("Write the World to checks weather palindrome or not:: -");
		String str=sc.nextLine();
		
		//get the lengh ofthe given string
		int len=str.length();
		System.out.println("Lenght of the given string is ::- "+len);
		System.out.println("actual string is:-"+str);
	    //get rev vaeriable
		String rev="";
		for(int i =len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("reversed string is:="+rev);
		//check weather string is palindrome or not by using equals method
		if(str.equalsIgnoreCase(rev)) {           //ref is diff  
			System.out.println("string is palindrome");
		}
		else
			System.out.println("STring is not palindrome");
	}

}
