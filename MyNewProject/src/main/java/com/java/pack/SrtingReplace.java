package com.java.pack;

public class SrtingReplace {

	public static void main(String[] args) {
		String s1="My name is jitubhai";
		String s2="name";
		String s3="fame";
		String astr[]=s1.split(s2);
		String sbt=new String();
		for(int i=0;i<astr.length;i++) {
			sbt=sbt.concat(astr[i]);
			if(i!=astr.length-1) {
				sbt=sbt.concat(s3);
				
			}
		}
System.out.println(sbt);
	}

}
