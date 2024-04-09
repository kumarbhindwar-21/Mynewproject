package com.java.pack;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			try {
			int i=10/0;
		}catch(ArithmeticException e) {
			System.out.println("Handled");
		}finally {
			System.out.println("Rest of the codes");
		}
		}catch(Exception e) {
			System.out.println("Jitendra Kumar");
		}
		finally {
			System.out.println("Rest of the code at last");
		}

	}

}
