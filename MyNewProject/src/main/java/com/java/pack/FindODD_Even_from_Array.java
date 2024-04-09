package com.java.pack;

public class FindODD_Even_from_Array {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,9,10,11};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("Even number: "+a[i]);
			}
		}
for(int j=0;j<a.length;j++) {
	if(a[j]%2 !=0) {
		System.out.println("Odd number: "+a[j]);
	}
}
	}

}
