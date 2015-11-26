package org.vandeursen.java.test;

class Animal{}

class Mammal extends Animal{}

class Cat extends Mammal{}

class Dog extends Mammal{}

public class CastInstanceOfTester {

	public static void main(String[] args) {
		Object Monkey = (Object) returnString();
		if (Monkey instanceof String) {
			System.out.println("true" + Monkey);
		} else {
			System.out.println("false");
		}
		Cat c = new Cat();
		Mammal cat = (Mammal)c;
		if (cat instanceof Cat) {
			// the upcast to Mammal does not mean the original type is lost
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	private static String returnString(){
		String aap = "baviaan";
		return aap;
	}

}
