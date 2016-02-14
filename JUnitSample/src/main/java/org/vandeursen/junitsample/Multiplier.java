package org.vandeursen.junitsample;

public class Multiplier {
	public int multiply(int x, int y) {
		if (x > 100) {
			throw new IllegalArgumentException("x kleiner of gelijk aan dan 100");
		}
		return x / y;
	}
}
