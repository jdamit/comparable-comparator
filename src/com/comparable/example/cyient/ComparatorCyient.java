package com.comparable.example.cyient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorCyient {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Two");
		list.add("One");
		list.add("Three");
		list.add("Four");
		
		Collections.sort(list, (o1, o2)-> o1.charAt(1) - o2.charAt(1));
		System.out.println(list);
	}

}
