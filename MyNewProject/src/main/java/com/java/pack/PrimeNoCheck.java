package com.java.pack;

import java.util.Scanner;

public class PrimeNoCheck {
		 
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	      /*  int temp, num;
	        boolean isPrime = true;
	        Scanner in = new Scanner(System.in);
	        num = in.nextInt();
	        in.close();
	        for (int i = 2; i<= num/2; i++) {
	            temp = num%i;
	            if (temp == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        if(isPrime) 
	            System.out.println(num + "number is prime");
	            else
	                System.out.println(num + "number is not a prime");*/
	///////////////////////////////////////////////////////////////////////////////    	
	         int count =0;   
	        Scanner scn=new Scanner(System.in) ;
	        System.out.println("Enter a number to be checked: ");
	        int n=scn.nextInt();
	        for(int i=1;i<=n;i++) {
	        	if(n%i==0) {
	        		count++;
	        	}
	        }
	        if(count==2) {
	        	System.out.println("Number is prime");
	        }else {
	        	System.out.println("number is not prime");
	        }
	    }
	 
	}

