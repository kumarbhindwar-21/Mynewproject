package com.java.pack;

public class Lower_Upper {

	public static void main(String[] args) {
		String s1="JitendraKumar";
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			int j=(char)c;
			if(j>=97 && j<=120) {
				j-=32;
				c=(char)j;
			}else if(j>=65 && j<=90){
				j+=32;
				c=(char)j;
			}
			sb.append(c);
				
			}
		System.out.println(sb.toString());
		}

	}


