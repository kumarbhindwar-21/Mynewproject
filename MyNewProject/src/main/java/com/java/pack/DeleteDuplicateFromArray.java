package com.java.pack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DeleteDuplicateFromArray {

	public static void main(String[] args) {
		int a[]= {1,2,2,4,4};
		ArrayList<Integer>al=new ArrayList<Integer>();
		for(Integer a1:a) {
			al.add(a1);
		}
	Set<Integer>sct=new HashSet<Integer>(al);
	System.out.println(sct);

	}

}
