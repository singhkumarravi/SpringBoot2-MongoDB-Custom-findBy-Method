package com.olive.main;

import java.util.Comparator;

public class A implements Comparator<Integer>{
	
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}	
}
