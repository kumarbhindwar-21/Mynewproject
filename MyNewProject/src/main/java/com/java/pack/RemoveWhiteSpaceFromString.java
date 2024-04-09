package com.java.pack;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		String str="My name is Radha";
		String str1=str.replaceAll("\\s", "");
		System.out.println(str1);
	//===============================================================//	
		char ch[]=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ch.length;i++) {
			if((ch[i]!=' ') && (ch[i]!='\t')){
				sb.append(ch[i]);
				
			}
		}
        System.out.println(sb);
	}

}
