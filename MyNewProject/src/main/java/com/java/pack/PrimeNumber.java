package com.java.pack;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int no, i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		no=s.nextInt();
		if(no==1) {
			System.out.println("Smallest prime no is 2");
		}
		for(i=2;i<no;i++) {
			if(no%i==0) {
				//System.out.println(no+"---->"+i);
				System.out.println("Not prime");
				break;
			}
			}
		System.out.println(i);
		if(no==i) {
			System.out.println("Prime");
		}
	}

}
