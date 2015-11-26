package org.vandeursen.java.test;

public class CastInstanceOfTester {

	public static void main(String[] args) {
		Object Monkey = (Object) returnString();
		if (Monkey instanceof String) {
			System.out.println("true" + Monkey);
		} else {
			System.out.println("false");
		}
	}
	
	private static String returnString(){
		String aap = "baviaan";
		return aap;
	}

}
