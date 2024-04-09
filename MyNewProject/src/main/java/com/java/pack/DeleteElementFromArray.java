package com.java.pack;

import java.util.Scanner;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		int a[]=new int[50];
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=scn.nextInt();
		for(int i=0;i<size;i++)
		{
			a[i]=scn.nextInt();
		}
     System.out.println("Select element to be deleted");
     int del=scn.nextInt();
     int count=0;
     for(int i=0;i<size;i++) {
    	 if(a[i]==del) {
    		 for(int j=i;j<size;j++) {
    			 a[j]=a[j+1];
    			 
    		 }
    		 ++count;
    		 break; 
    	 }
     }
     if(count==0) {
    	 System.out.println("Not matched");
     }else {
    	 for(int i=0;i<size-1;i++) {
    	 System.out.print(a[i]+" ");
    	 }
     }
	}

}
