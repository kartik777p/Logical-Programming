package com.nit.string;



public class RevStringByUsingCharArray01 {

	public static void main(String[] args) {
		//craete a String veriable
		String str="Kartik";
		//make it as lovercase
		str=str.toLowerCase();
		//convert string to char Array
		char ch[]=str.toCharArray();
		//get the lengh of the arry by using .lengh propertie
		int len=ch.length;
		System.out.println("lengh of the string is:-"+len );
		//declare one veriable to hold reverse string
       String rev="";
		//itrate for loop 
		for(int i=len-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println("reverse String is ::-"+rev);
	}

}
