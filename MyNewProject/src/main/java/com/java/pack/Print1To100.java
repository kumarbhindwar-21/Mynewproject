package com.java.pack;

public class Print1To100 {
	static int count=0;
	public static void m1() {
		System.out.println(++count+" ");
		if(count<100) {
			m1();
		}
	}
public static void main(String[] args) {
	m1();
}
}
