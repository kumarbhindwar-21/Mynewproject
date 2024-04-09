package com.java.pack;

public class PracticeAll {

	public static void main(String[] args) {
		String str="My name is Jitendra Kumar";
		String words[]=str.split(" ");
		String rev="";
		
		for(int i=0;i<words.length;i++) {
			String rev_word="";
			String word=words[i];
			for(int j=word.length()-1;j>=0;j--) {
				rev_word+=word.charAt(j);
			}
			rev+=rev_word+" ";
		}
System.out.println(rev);
	}
}
