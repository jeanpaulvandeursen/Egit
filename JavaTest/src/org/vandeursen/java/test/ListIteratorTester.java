package org.vandeursen.java.test;

import java.util.*;

public class ListIteratorTester {

	public static void main(String[] args) {
		
		List<String> firstArray = new ArrayList<>();
		List<String> secondArray = new ArrayList<>();
		
		firstArray.add("a");
		firstArray.add("d");
		firstArray.add("b");
		firstArray.add("c");
		Collections.sort(firstArray);
		firstArray.forEach(System.out::println);
		System.out.println("");
		
		secondArray.add("a");
		secondArray.add("e");
		secondArray.add("f");
		secondArray.add("d");
		Collections.sort(secondArray);
// Using a Java 8 Collections forEach method with a lambda expression		
		secondArray.forEach(s -> { if (!firstArray.contains(s)) firstArray.add(s); });
		
//		firstArray.addAll(secondArray);
		System.out.println("");
		System.out.println("1st + 2nd:");
		firstArray.forEach(System.out::println);
	}

}
