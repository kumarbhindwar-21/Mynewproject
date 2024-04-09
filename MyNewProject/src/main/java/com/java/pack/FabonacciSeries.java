package com.java.pack;

import java.util.Scanner;

public class FabonacciSeries {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,count;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter count number");
		count=scn.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println(n1+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			//System.out.println(n1);
		}

	}

}
