package com.comparable.example;

import java.util.TreeSet;

public class ComparableFacts {

	public static void main(String[] args) {
		TreeSet<Integer> integerSet1 = new TreeSet<Integer>((o1,o2)->o1.compareTo(o2));
		integerSet1.add(30);
		integerSet1.add(10);
		integerSet1.add(40);
		integerSet1.add(05);
		integerSet1.forEach(item->System.out.println(item));
		
		System.out.println("----------------------------------------------");
		TreeSet<Integer> integerSet = new TreeSet<Integer>(
				(o1,o2)->{
					Integer i1 = (Integer)o1;
					Integer i2 = (Integer)o2;
					if(i1<i2)return +1;
					else if(i1>i2) return -1;
					else return 0;
				}
				);
		integerSet.add(30);
		integerSet.add(10);
		integerSet.add(40);
		integerSet.add(05);
		//integerSet.forEach(item->System.out.println(item));
		
		TreeSet<Integer> integerSet2 = new TreeSet<Integer>((o1,o2)->+1);
		integerSet2.add(12);
		integerSet2.add(10);
		integerSet2.add(40);
		integerSet2.add(40);
		integerSet2.add(0);
		integerSet2.add(23);
		integerSet2.forEach(item->System.out.println(item));
		
		TreeSet<Integer> integerSet3 = new TreeSet<Integer>((o1,o2)->-1);
		integerSet3.add(12);
		integerSet3.add(10);
		integerSet3.add(40);
		integerSet3.add(40);
		integerSet3.add(0);
		integerSet3.add(23);
		System.out.println();
		integerSet3.forEach(item->System.out.println(item));
		
		TreeSet<String> stringSet = new TreeSet<String>((o1,o2)->o2.compareTo(o1));
		stringSet.add("z");
		stringSet.add("a");
		stringSet.add("x");
		stringSet.add("m");
		stringSet.add("k");
		stringSet.add("n");
		System.out.println();
		stringSet.forEach(item->System.out.println(item));
		
		TreeSet<Object> stringBufferSet = new TreeSet<Object>((o1,o2)->o1.toString().compareTo(o2.toString()));
		stringBufferSet.add(new StringBuffer("z"));
		stringBufferSet.add(new StringBuffer("aa"));
		stringBufferSet.add(new StringBuffer("x"));
		stringBufferSet.add(new StringBuffer("m"));
		stringBufferSet.add(new StringBuffer("k"));
		stringBufferSet.add(new StringBuffer("n"));
		stringBufferSet.add(new String("bb"));
		System.out.println();
		stringBufferSet.forEach(item->System.out.println(item));
		
		TreeSet<StringBuffer> onlyStringBufferset = new TreeSet<>((o1,o2)->o1.toString().compareTo(o2.toString()));
		onlyStringBufferset.add(new StringBuffer("z"));
		onlyStringBufferset.add(new StringBuffer("aa"));
		onlyStringBufferset.add(new StringBuffer("x"));
		onlyStringBufferset.add(new StringBuffer("m"));
		onlyStringBufferset.add(new StringBuffer("k"));
		onlyStringBufferset.add(new StringBuffer("n"));
		System.out.println("onlyStringBufferset");
		onlyStringBufferset.forEach(item->System.out.println(item));
	}

}
