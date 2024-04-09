package com.java.pack;

public class Palindrome {
	public static void main(String[] args) {
		
		
		  int num=151,sum=0,temp; 
		  temp=num; 
		  while(num>0) { 
			  int rem=num%10;
		  sum=sum*10+rem;
		  num=num/10; 
		  } System.out.println(sum);
		  System.out.println(temp);
		  if(sum==temp) {
			  System.out.println("palindrome"); 
			  }
		  else { System.out.println("not plindrome");
		  }
		 
		 
				
	}
}
