package org.vandeursen.java.test;

class Beest{}

class Zoogdier extends Beest{
	public void makeSound(){};
}

class Kat extends Zoogdier{
	@Override
	public void makeSound(){
		System.out.println("miauw");
	}
}

class Hond extends Zoogdier{}

public class AnnotationTester {
	public static void main(String[] args){
		Kat kat = new Kat();
		kat.makeSound();
	}
}
