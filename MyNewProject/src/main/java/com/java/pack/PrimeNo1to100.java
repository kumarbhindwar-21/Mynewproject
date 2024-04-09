package com.java.pack;

public class PrimeNo1to100 {
	public static void main(String[] args) {
		int num=0;
		int i=0;
		for(i=1;i<=100;i++) {
			int counter=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					counter=counter+1;
					
				}
			}
			if(counter==2) {
				System.out.print(i+" ");
			}
		}
	}

}
