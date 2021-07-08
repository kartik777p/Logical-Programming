package com.nit.string;

import java.util.Scanner;

public class RevStringWithOutUsingMethod {

	public static void main(String[] args) {
		//read date from enduser
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string ::- ");
		String str=sc.nextLine();
		//get the length of the string
		int len=str.length();
		System.out.println("Lengh of the string is ::-"+len);
		//declare one veribale to hold rev string
		String rev="";
		//itrate for loop to reverse the string
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
  System.out.println("Reverse STring is :- "+rev);
	}

}
