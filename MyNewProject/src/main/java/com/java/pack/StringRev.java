package com.java.pack;

public class StringRev {

	public static void main(String[] args) {
		String str="JitendraKumar";
		char ch[]=str.toCharArray();
		String rev="";
		int length=str.length();
		for(int i=length-1;i>=0;i--) {
			rev+=ch[i];
		}
System.out.println(rev);
	}

}
