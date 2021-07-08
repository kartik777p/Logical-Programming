package com.nit.string;



public class RevStringByUsingStringBuffer01 {

	public static void main(String[] args) {
		//craete a String veriable
		String str="Kartik";
		//make it as lovercase
		str=str.toLowerCase();
		//create string buffer class obj by pointing the gievn string as input
		StringBuffer sbf=new StringBuffer(str);
		//use predifined buffer class mthod to reverse the string
		System.out.println("reverse String is :-"+sbf.reverse());
	}

}
