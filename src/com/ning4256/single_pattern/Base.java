package com.ning4256.single_pattern;

public class Base {
	public static void main(String[] args) {
		Full full1 = Full.getInstance();
		Full full2 = Full.getInstance();
		System.out.println(full1);
		System.out.println(full2);
		
		Hungry hungry1 = Hungry.getInstance();
		Hungry hungry2 = Hungry.getInstance();
		System.out.println(hungry1);
		System.out.println(hungry2);
		
	}
}
