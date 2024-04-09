package com.java.pack;

public class MissingNo {
public static void m1(int arr[]) {
	int count=1;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==count) {
			count++;
		}
		}
	System.out.print(count);
}
public static void main(String[] args) {
	int a[]= {1,2,3,4,7,5,8};
	m1(a);
}
}
