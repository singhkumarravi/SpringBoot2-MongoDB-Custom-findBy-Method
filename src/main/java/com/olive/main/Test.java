package com.olive.main;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
	 TreeSet t=new TreeSet(new MyCompartor());
	 t.add(10);
	 t.add(50);
	 t.add(20);
	 t.add(6);
	 t.add(2);
	 System.out.println(t);

	}

}
