package com.nit.string;



public class RevStringWithOutUsingMethod {

	public static void main(String[] args) {
		//craete a String veriable
		String str="Kartik";
		//get the lenghth of the string
		int len=str.length();
		String rev="";
		System.out.println("Lenght of the String is ::- "+len);
		//initialize rev veriable with default value
		//use for loop for the reverse string
		for(int i=len-1;i>=0;i--) {     //6-1(index start from 0)
	     rev=rev+str.charAt(i);	
		}//for
		System.out.println("Reverse string is ::- "+rev);
	}

}
