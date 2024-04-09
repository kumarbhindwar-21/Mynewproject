package com.java.pack;

public class ReplaceCharFromString {

	public static void main(String[] args) {
		String str="123Jitu765kumar";
		String s1=str.replaceAll("[a-zA-Z]", "");
		System.out.println(s1);
		
		String s=str.replaceAll("[0-9]", "");
		System.out.println(s);
		String str2="JitendraKumar";
		String s2=str2.replace("Kumar", "");
		System.out.println(s2);

	}

}
