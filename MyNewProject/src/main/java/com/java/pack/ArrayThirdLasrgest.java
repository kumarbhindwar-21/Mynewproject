package com.java.pack;

public class ArrayThirdLasrgest {
	public static int arr(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=1+i;j<a.length;j++) {
				if(a[i]>a[j]) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		}
		return a[a.length-3];
			
	}
public static void main(String[] args) {
	int a1[]= {1,5,2,7,3,5};
	System.out.println(arr(a1));
	
}
}
